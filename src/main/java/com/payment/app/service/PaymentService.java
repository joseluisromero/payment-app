package com.payment.app.service;

import com.payment.app.model.Payment;

public class PaymentService {
    // Violación SRP (responsable de múltiples cosas)
    // Violación OCP (if/else gigante)
    // Violación DIP (depende de clases concretas, no de abstracciones)
    public void processPayment(Payment payment) {
        if (payment.getType().equals("creditCard")) {
            System.out.println("Procesando pago con Tarjeta de Crédito: " + payment.getAmount());
            // lógica tarjeta
        } else if (payment.getType().equals("paypal")) {
            System.out.println("Procesando pago con PayPal: " + payment.getAmount());
            // lógica paypal
        } else {
            throw new IllegalArgumentException("Método de pago no soportado");
        }
    }
}
