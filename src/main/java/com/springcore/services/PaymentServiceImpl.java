package com.springcore.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment() {

        // payment code

        System.out.println("Amount Debited.");

        // code for other transactions

        System.out.println("Amount Credited.");

    }

}
