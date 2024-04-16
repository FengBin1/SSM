package com.hsy.demo1;

public class Student {

    private String name;
    private School school;
    private String sex;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, School school) {
        this.setName(name);
        this.setSchool(school);
    }

    public Student(String name, String sex, School school) {
        this.setName(name);
        this.setSex(sex);
        this.setSchool(school);
    }

    public Student(String name, String sex, double height) {
        this.setName(name);
        this.setSex(sex);
        this.setHeight(height);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", school=" + school + ", sex=" + sex + ", height=" + height + "]";
    }


}
