package com.payment.app.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class Payment {
    private String type; // "creditCard" o "paypal"
    private double amount;
}
