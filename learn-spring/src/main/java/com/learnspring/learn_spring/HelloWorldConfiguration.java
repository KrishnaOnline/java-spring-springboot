package com.learnspring.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
        return 24;
    }

    @Bean
    public Person person() {
        var person1 = new Person("Sherlock", 27, new Address("Baker Street", "London"));
        return person1;
    }

    @Bean(name = "getAddress1")   // custom name for the bean, need to be called with this name only...
    public Address address1() {
        var address1 = new Address("Silicon Valley", "San Fransisco");
        return address1;
    }

    // @Bean(name = "gerAddress2")
    // public Address address2() {
    //     var address2 = new Address("Jublee Hills", "Hyderabad");
    //     return address2;
    // }

    @Bean
    public Person person2ByMethodCall() {
        return new Person(name(), age(), address1());
    }
    // OR
    @Bean
    public Person person3ByParameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }
}