package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        // Load XML configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        // Retrieve the bean
//        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
//
//        // Use the bean
//        greetingService.sayHello();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve a bean from the container
        UserService userService = context.getBean(UserService.class);
        userService.printMessage();

    }
}
