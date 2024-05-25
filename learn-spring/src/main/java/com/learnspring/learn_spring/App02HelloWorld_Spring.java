package com.learnspring.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld_Spring {
    public static void main(String[] args) {
        // 1: Launch Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage - 
        //    [in HelloWorldConfiguration file...]
        //    HelloWorldConfiguration class - with @Configuration annotation
        //    name method - with @Bean annotation
        
        // 3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}