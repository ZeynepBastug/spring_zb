package com.practice.been_package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigEmp {
    @Bean
    public FulltimeEmployee fulltimeEmployee(){
        return new FulltimeEmployee();
    }

    @Bean
    public ParttimeEmployee parttimeEmployee(){
        return new ParttimeEmployee();
    }


}
