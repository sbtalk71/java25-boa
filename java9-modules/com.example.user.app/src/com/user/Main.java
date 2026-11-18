package com.user;

import com.payment.spi.PaymentService;

import java.util.ServiceLoader;

public class Main {
    static void main() {
        ServiceLoader<PaymentService> loader=ServiceLoader.load(PaymentService.class);
        for(PaymentService service:loader){
            service.pay(2000);
        }
    }


}
