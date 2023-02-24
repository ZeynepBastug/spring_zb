package com.practice.been_package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigCydeo {

    @Bean  (name = "String 1") //customize name
    public String str1 (){
        return "Welcome to Cydeo";
    }

    @Bean
    public String str2(){ //we can specify based on method name
        return "Spring Core Practice";
    }

    @Bean
    @Primary  // no specification required. it is a primary method
    public String str3(){
        return "Thank you for choosing Cydeo";
    }


}
