package com.practice.stereotype_annotation.config;

import com.practice.stereotype_annotation.model.DataStructure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();
    }
}
