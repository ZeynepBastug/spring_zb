package com.practice.been_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmp.class, ConfigCydeo.class);

        FulltimeEmployee ftEmp = container.getBean(FulltimeEmployee.class);
        ftEmp.createAccount();


        String str1 = container.getBean("String 1",String.class);
        System.out.println(str1);

        String str2 = container.getBean("str2",String.class);
        System.out.println(str2);

        String str3 = container.getBean(String.class);
        System.out.println(str3);


    }
}
