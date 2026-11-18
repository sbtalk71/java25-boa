package com.payment.cc.impl;

import com.payment.spi.PaymentService;

public class CreditCardPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println(amount +" paid using Credit Card..");
    }
}
