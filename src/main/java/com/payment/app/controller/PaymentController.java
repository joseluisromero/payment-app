package com.payment.app.controller;

import com.payment.app.model.Payment;
import com.payment.app.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private PaymentService service = new PaymentService(); // Violación DIP

    @PostMapping("/pay")
    public void pay(@RequestBody Payment payment) {
        service.processPayment(payment);
    }
}
