package com.hsy.demo1;

public class School {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School [name=" + name + "]";
    }

}
