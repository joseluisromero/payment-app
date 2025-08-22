package com.payment.app.service;

import com.payment.app.model.Payment;

public interface PaymentMethodService {
    void pay(Payment payment);
}
