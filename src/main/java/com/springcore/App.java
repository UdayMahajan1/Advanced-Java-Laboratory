package com.springcore;

import com.springcore.config.AppConfig;
import com.springcore.services.PaymentService;
import com.springcore.services.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.makePayment();

    }
}
