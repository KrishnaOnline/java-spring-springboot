package com.learnspring.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String street, String city) {};
// record is introduces in JDK-16, to avoid verbosity, in creating "getters", "setters" and "constructors" in classes,
// record does it automatically and can write any other properties in it also...

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Krish";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        var person1 = new Person("Sherlock", 27);
        return person1;
    }

    @Bean
    public Address address() {
        var address1 = new Address("Baker Street", "London");
        return address1;
    }
}