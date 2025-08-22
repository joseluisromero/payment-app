package com.payment.app.service.impl;

import com.payment.app.model.Payment;
import com.payment.app.service.PaymentMethodService;
import com.payment.app.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void processPayment(Payment payment, PaymentMethodService paymentMethodService) {

        paymentMethodService.pay(payment);
    }
}
