package com.hsy.demo2;

import java.util.List;
import java.util.Map;

public class Classes {

    private String name;
    private Map<String, Student> stus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Student> getStus() {
        return stus;
    }

    public void setStus(Map<String, Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Classes [name=" + name + ", stus=" + stus + "]";
    }

}
