package com.hsy.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //加载Spring的核心配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Spring的IOC容器获取JavaBean的对象
        Student stu1 = ac.getBean(Student.class);
        System.out.println(stu1);
    }

}
