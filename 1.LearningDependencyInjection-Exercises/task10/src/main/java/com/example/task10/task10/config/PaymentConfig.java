package com.example.task10.task10.config;

import com.example.task10.task10.payment.PaymentManager;
import com.example.task10.task10.payment.PaymentProcessor;
import com.example.task10.task10.payment.PaypalProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentProcessor paymentProcessor(){
        return new PaypalProcessor();
        // return new StripeProcessor();
    }

    @Bean
    public PaymentManager paymentManager(){
        return new PaymentManager(paymentProcessor());
    }
}
