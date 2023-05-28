package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor(){
    return new CustomBeanPostProcessor();
    }
    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }
}
