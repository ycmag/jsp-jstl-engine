/*
 * $RCSfile: TagFactoryManager.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.factory;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

import com.skin.ayada.runtime.TagFactory;
import com.skin.ayada.tagext.Tag;

/**
 * <p>Title: TagFactoryManager</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class TagFactoryManager {
    private FactoryClassLoader factoryClassLoader;
    private Map<String, TagFactory> context;
    private static TagFactoryManager instance = new TagFactoryManager();
    private static final Logger logger = LoggerFactory.getLogger(TagFactoryManager.class);

    static{
        ClassPool classPool = ClassPool.getDefault();
        classPool.appendClassPath(new ClassClassPath(DefaultTagFactory.class));
    }

    /**
     * @param tagName
     * @param tagClassName
     * @return Tag
     */
    public static Tag getTag(String tagName, String tagClassName) {
        TagFactoryManager tagFactoryManager = TagFactoryManager.getInstance();
        TagFactory tagFactory = tagFactoryManager.getTagFactory(tagName, tagClassName);
        return tagFactory.create();
    }

    private TagFactoryManager() {
        this.context = new HashMap<String, TagFactory>();
        this.factoryClassLoader = FactoryClassLoader.getInstance();
    }

    /**
     * @return TagFactoryManager
     */
    public static TagFactoryManager getInstance() {
        return instance;
    }

    /**
     * @param tagName
     * @param className
     * @return TagFactory
     */
    public synchronized TagFactory getTagFactory(String tagName, String className) {
        TagFactory tagFactory = this.context.get(className);

        if(tagFactory == null) {
            tagFactory = this.create(tagName, className);

            if(tagFactory == null) {
                tagFactory = new DefaultTagFactory();
                tagFactory.setTagName(tagName);
                tagFactory.setClassName(className);
            }

            if(logger.isDebugEnabled()) {
                logger.debug("tagName: " + tagName + ", className: " + className + ", tagFactory: " + tagFactory.getClass().getName());
            }
            this.context.put(className, tagFactory);
        }
        return tagFactory;
    }

    /**
     * @param tagName
     * @param className
     * @return TagFactory
     */
    public TagFactory create(String tagName, String className) {
        ClassPool classPool = ClassPool.getDefault();

        try {
            String returnClassName = Tag.class.getName();
            String surperClassName = DefaultTagFactory.class.getName();
            String factoryClassName = this.getFactoryClassName(className);
            CtClass ctClass = classPool.makeClass(factoryClassName);
            ctClass.setSuperclass(classPool.get(surperClassName));
            CtMethod method = CtNewMethod.make("public " + returnClassName + " create(){return new " + className + "();}", ctClass);
            ctClass.addMethod(method);

            TagFactory tagFactory = (TagFactory)(this.getInstance(factoryClassName, ctClass.toBytecode()));
            tagFactory.setTagName(tagName);
            tagFactory.setClassName(className);
            return tagFactory;
        }
        catch(Exception e) {
            logger.warn(e.getMessage(), e);
        }
        return null;
    }

    /**
     * @param className
     * @return String
     */
    private String getFactoryClassName(String className) {
        String packageName = "";
        String simpleClassName = className;
        int k = simpleClassName.lastIndexOf(".");

        if(k > -1) {
            packageName = simpleClassName.substring(0, k);
            simpleClassName = simpleClassName.substring(k + 1);
        }
        return "_tpl." + packageName + ".factory." + simpleClassName + "Factory";
    }

    /**
     * @param className
     * @param bytes
     * @return Object
     */
    public Object getInstance(String className, byte[] bytes) {
        Class<?> clazz = this.factoryClassLoader.create(className, bytes);

        try {
            return clazz.newInstance();
        }
        catch(Exception e) {
            logger.warn(e.getMessage(), e);
        }
        return null;
    }
}
