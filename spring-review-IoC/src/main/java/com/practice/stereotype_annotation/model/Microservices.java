package com.practice.stereotype_annotation.model;

import org.springframework.stereotype.Component;

@Component
public class Microservices {

    public void getTotalHours(){
        System.out.println("Total Hours: " + 20);
    }
}
