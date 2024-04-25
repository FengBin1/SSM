package com.hsy.demo2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Classes {
    /*Set集合*/
    private String name;
    private Set<Student> stus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStus() {
        return stus;
    }

    public void setStus(Set<Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", stus=" + stus +
                '}';
    }
    /*List集合
    private String name;
    private List<Student> stus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", stus=" + stus +
                '}';
    }
    */

    /* Map集合
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
    */
}
