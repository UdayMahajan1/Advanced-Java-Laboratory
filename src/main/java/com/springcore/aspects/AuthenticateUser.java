package com.springcore.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticateUser {

    @Before("execution(* com.springcore.services.PaymentServiceImpl.makePayment())")
    // the syntax to declare advice is execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)
    //            throws-pattern?)
    // in the above code the * means that the method authenticateUser must be triggered for any return type of the specified method.
    public void authenticateUser() {
        // code for authentication

        System.out.println("User Authenticated");
    }

}