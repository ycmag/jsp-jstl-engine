/*
 * $RCSfile: Column.java,v $
 * $Revision: 1.1  $
 * $Date: 2009-02-16  $
 *
 * Copyright (C) 2005 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.database;

/**
 * <p>Title: Column</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public class Column {
    private String alias;
    private String columnCode;
    private String columnName;
    private int dataType;
    private String typeName;
    private int autoIncrement;
    private int columnSize;
    private int decimalDigits;
    private String columnDef;
    private int nullable;
    private int precision;
    private boolean primaryKey;
    private String remarks;
    private String variableName;
    private String javaTypeName;
    private String methodSetter;
    private String methodGetter;
    private Object value;
    private Table table;

    /**
     *
     */
    public Column() {
    }

    /**
     * @param columnName
     */
    public Column(String columnName) {
        this(columnName, null);
    }

    /**
     * @param columnName
     * @param alias
     */
    public Column(String columnName, String alias) {
        this.alias = alias;
        this.columnName = columnName;
        this.autoIncrement = 0;
        this.nullable = 1;
    }

    /**
     * @param c
     */
    public Column(Column c) {
        if(c != null) {
            this.alias = c.alias;
            this.columnName = c.columnName;
            this.columnCode = c.columnCode;
            this.dataType = c.dataType;
            this.typeName = c.typeName;
            this.autoIncrement = c.autoIncrement;
            this.columnSize = c.columnSize;
            this.decimalDigits = c.decimalDigits;
            this.columnDef = c.columnDef;
            this.remarks = c.remarks;
            this.nullable = c.nullable;
            this.precision = c.precision;
            this.variableName = c.variableName;
            this.javaTypeName = c.javaTypeName;
            this.methodSetter = c.methodSetter;
            this.methodGetter = c.methodGetter;
            this.table = c.table;
        }
    }

    /**
     * @param table
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * @return Table
     */
    public Table getTable() {
        return this.table;
    }

    /**
     * @return String
     */
    public String getTableName() {
        if(this.table != null) {
            return this.table.getTableName();
        }
        return null;
    }

    /**
     * @return String
     */
    public String getTableAlias() {
        if(this.table != null) {
            return this.table.getAlias();
        }
        return null;
    }

    /**
     * @return String
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @param columnCode
     */
    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    /**
     * @return String
     */
    public String getColumnCode() {
        return this.columnCode;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return String
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return int
     */
    public int getDataType() {
        return this.dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    /**
     * @return String
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return the autoIncrement
     */
    public int getAutoIncrement() {
        return this.autoIncrement;
    }

    /**
     * @param autoIncrement the autoIncrement to set
     */
    public void setAutoIncrement(int autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    /**
     * @return int
     */
    public int getColumnSize() {
        return this.columnSize;
    }

    /**
     * @param columnSize
     */
    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    /**
     * @return int
     */
    public int getDecimalDigits() {
        return this.decimalDigits;
    }

    /**
     * @param decimalDigits
     */
    public void setDecimalDigits(int decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    /**
     * @return String
     */
    public String getColumnDef() {
        return this.columnDef;
    }

    /**
     * @param columnDef
     */
    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
    }

    /**
     * @return String
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return int
     */
    public int getNullable() {
        return this.nullable;
    }

    /**
     * @param nullable
     */
    public void setNullable(int nullable) {
        this.nullable = nullable;
    }

    /**
     * @return int
     */
    public int getPrecision() {
        return this.precision;
    }

    /**
     * @param precision
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * @param primaryKey
     */
    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * @return boolean
     */
    public boolean getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return String
     */
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * @param variableName
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * @return String
     */
    public String getJavaTypeName() {
        return this.javaTypeName;
    }

    /**
     * @param javaTypeName
     */
    public void setJavaTypeName(String javaTypeName) {
        this.javaTypeName = javaTypeName;
    }

    /**
     * @return String
     */
    public String getMethodSetter() {
        return this.methodSetter;
    }

    /**
     * @param methodSetter
     */
    public void setMethodSetter(String methodSetter) {
        this.methodSetter = methodSetter;
    }

    /**
     * @return String
     */
    public String getMethodGetter() {
        return this.methodGetter;
    }

    /**
     * @param methodGetter
     */
    public void setMethodGetter(String methodGetter) {
        this.methodGetter = methodGetter;
    }

    /**
     * @param object
     */
    public void setValue(Object object) {
        this.value = object;
    }

    /**
     * @return Object
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<column");
        buffer.append(" alias=\"" + this.alias).append("\"");
        buffer.append(" columnCode=\"" + this.columnCode).append("\"");
        buffer.append(" columnName=\"" + this.columnName).append("\"");
        buffer.append(" dataType=\"" + this.dataType).append("\"");
        buffer.append(" typeName=\"" + this.typeName).append("\"");
        buffer.append(" autoIncrement=\"" + this.autoIncrement).append("\"");
        buffer.append(" length=\"" + this.columnSize).append("\"");
        buffer.append(" decimalDigits=\"" + this.decimalDigits).append("\"");
        buffer.append(" columnDef=\"" + this.columnDef).append("\"");
        buffer.append(" precision=\"" + this.precision).append("\"");
        buffer.append(" nullable=\"" + this.nullable).append("\"");
        buffer.append(" primaryKey=\"" + this.primaryKey).append("\"");
        buffer.append(" variableName=\"" + this.variableName).append("\"");
        buffer.append(" javaTypeName=\"" + this.javaTypeName).append("\"");
        buffer.append(" methodSetter=\"" + this.methodSetter).append("\"");
        buffer.append(" methodGetter=\"" + this.methodGetter).append("\"");
        buffer.append(" remarks=\"" + this.remarks).append("\"");
        buffer.append("/>");
        return buffer.toString();
    }
}
