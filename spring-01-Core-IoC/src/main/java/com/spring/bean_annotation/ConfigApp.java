package com.spring.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean (name = "p1")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean (name = "p2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
    @Bean
    @Primary
    Developer developer(){
        return new Developer();
    }
    @Bean
    Developer developer2(){
        return new Developer();
    }
}
