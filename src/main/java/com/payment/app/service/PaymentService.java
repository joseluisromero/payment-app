package com.payment.app.service;

import com.payment.app.model.Payment;

public interface PaymentService {

    void processPayment(Payment payment, PaymentMethodService paymentMethodService);
}
