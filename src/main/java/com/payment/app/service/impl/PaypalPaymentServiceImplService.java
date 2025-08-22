package com.payment.app.service.impl;

import com.payment.app.model.Payment;
import com.payment.app.service.PaymentMethodService;
import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentServiceImplService implements PaymentMethodService {
    @Override
    public void pay(Payment payment) {
        System.out.println("Pagando con PayPal: " + payment.getAmount());
    }
}
