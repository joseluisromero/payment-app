package com.payment.app.service.impl;

import com.payment.app.model.Payment;
import com.payment.app.service.PaymentMethodService;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentServiceImplService implements PaymentMethodService {
    @Override
    public void pay(Payment payment) {
        System.out.println("Pagando con Tarjeta de Crédito: " + payment.getAmount());
    }
}
