package com.springcore.config;

import com.springcore.aspects.AuthenticateUser;
import com.springcore.services.PaymentServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.springcore")
@EnableAspectJAutoProxy // enabling the aspectJ proxy (it is to be done in the appconfig class itself)
public class AppConfig {

//    @Bean
//    public AuthenticateUser authenticateUser() {
//        return new AuthenticateUser();
//    }
//
//    @Bean
//    public PaymentServiceImpl paymentService() {
//        return new PaymentServiceImpl();
//    }

}
