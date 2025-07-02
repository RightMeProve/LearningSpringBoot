package com.example.task10.task10.payment;

public class PaymentManager {
    private final PaymentProcessor paymentProcessor;

    public PaymentManager(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void pay(double amount){
        System.out.println("Intialising payment...");
        paymentProcessor.processPayment(amount);
    }

}
