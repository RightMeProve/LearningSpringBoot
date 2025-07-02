package com.example.task10.task10.payment;

public class StripeProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount){
        System.out.println("Process payment of "+ amount + " via Stripe.");
    }
}
