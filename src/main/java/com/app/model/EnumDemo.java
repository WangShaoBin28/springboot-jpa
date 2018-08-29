package com.app.model;

public enum EnumDemo {
    RED("red", "红色",1), GREEN("green", "绿色",2), BLUE("blue", "蓝色",3);

    private String key;
    private String value;
    private Integer integer;

    private EnumDemo(String key, String value,Integer integer) {
        this.key = key;
        this.value = value;
        this.integer = integer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
