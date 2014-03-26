/*
 * $RCSfile: ConnectTag.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-3-25 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.jstl.sql;

import java.sql.Connection;

import com.skin.ayada.tagext.Tag;
import com.skin.ayada.tagext.TagSupport;
import com.skin.ayada.tagext.TryCatchFinally;

/**
 * <p>Title: ConnectTag</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class ConnectTag extends TagSupport implements TryCatchFinally
{
    private String var;
    private String url;
    private String driverClass;
    private String userName;
    private String password;
    private String properties;
    private Connection connection;

    @Override
    public int doStartTag() throws Exception
    {
        if(this.var != null)
        {
            if(this.connection == null)
            {
                if(this.url != null)
                {
                    if(this.properties != null)
                    {
                        this.connection = Jdbc.connect(url, driverClass, Jdbc.parse(this.properties));
                    }
                    else
                    {
                        this.connection = Jdbc.connect(url, driverClass, userName, password);
                    }
                }
            }

            this.pageContext.setAttribute(this.var, this.connection);
        }

        return Tag.EVAL_PAGE;
    }

    /**
     * @return int
     */
    @Override
    public int doEndTag() throws Exception
    {
        return Tag.EVAL_PAGE;
    }

    @Override
    public void doCatch(Throwable throwable) throws Throwable
    {
        if(throwable != null)
        {
            throw throwable;
        }
        else
        {
            throw new RuntimeException("RuntimeExceptione: UnknownException - null");
        }
    }

    @Override
    public void doFinally()
    {
        Jdbc.close(this.connection);
    }

    /**
     * @return the var
     */
    public String getVar()
    {
        return this.var;
    }

    /**
     * @param var the var to set
     */
    public void setVar(String var)
    {
        this.var = var;
    }

    /**
     * @return the url
     */
    public String getUrl()
    {
        return this.url;
    }
    
    /**
     * @param url the url to set
     */
    public void setUrl(String url)
    {
        this.url = url;
    }
    
    /**
     * @return the driverClass
     */
    public String getDriverClass()
    {
        return this.driverClass;
    }
    
    /**
     * @param driverClass the driverClass to set
     */
    public void setDriverClass(String driverClass)
    {
        this.driverClass = driverClass;
    }
    
    /**
     * @return the userName
     */
    public String getUserName()
    {
        return this.userName;
    }
    
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    /**
     * @return the password
     */
    public String getPassword()
    {
        return this.password;
    }
    
    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * @return the properties
     */
    public String getProperties()
    {
        return this.properties;
    }
    
    /**
     * @param properties the properties to set
     */
    public void setProperties(String properties)
    {
        this.properties = properties;
    }

    /**
     * @return the connection
     */
    public Connection getConnection()
    {
        return this.connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }
}
