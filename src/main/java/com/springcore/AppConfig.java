package com.springcore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore")
public class AppConfig {

    // Defining a bean using @Bean annotation
    @Bean
    public MessageService messageService() {
        return new MessageService();  // Directly creating an instance of MessageService
    }

    // Defining another bean
    @Bean
    public UserService userService() {
        return new UserService(messageService());  // Directly creating an instance of UserService
    }

}
