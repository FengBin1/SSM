package com.hsy.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //加载Spring的核心配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Spring的IOC容器获取JavaBean的对象
        /*完成HelloWorld类型Bean的配置
        HelloWorld helloWorld = (HelloWorld)ac.getBean("helloWorld");
        helloWorld.sayHello();
        */
        /*完成Student类型以及School类型的配置，并设置Student与School之间的引用关系*/
        Student stu = ac.getBean(Student.class);
        System.out.println(stu);

    }

}

