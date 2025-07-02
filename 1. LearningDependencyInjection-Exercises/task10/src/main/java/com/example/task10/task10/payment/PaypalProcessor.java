package com.example.task10.task10.payment;

public class PaypalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of " + amount + " via Paypal");
    }
}
