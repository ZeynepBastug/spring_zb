package com.practice.stereotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.practice.stereotype_annotation.model")
public class ConfigApp {
}
