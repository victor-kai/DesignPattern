package com.anz.file;

public class Column {

    private String name;
    private String value;
    private String datetype;
    private int length;
    private boolean isnullable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDatetype() {
        return datetype;
    }

    public void setDatetype(String datetype) {
        this.datetype = datetype;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isIsnullable() {
        return isnullable;
    }

    public void setIsnullable(boolean isnullable) {
        this.isnullable = isnullable;
    }

}
