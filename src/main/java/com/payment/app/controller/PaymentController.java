package com.payment.app.controller;

import com.payment.app.model.Payment;
import com.payment.app.service.PaymentService;
import com.payment.app.service.impl.CreditCardPaymentServiceImplService;
import com.payment.app.service.impl.PaypalPaymentServiceImplService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/credit")
    public void credit(@RequestParam double amount) {
        paymentService.processPayment(new Payment(amount), new CreditCardPaymentServiceImplService());
    }

    @PostMapping("/paypal")
    public void paypal(@RequestParam double amount) {
        paymentService.processPayment(new Payment(amount), new PaypalPaymentServiceImplService());
    }
}
