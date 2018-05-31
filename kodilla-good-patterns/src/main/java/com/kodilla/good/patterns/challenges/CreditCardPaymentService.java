package com.kodilla.good.patterns.challenges;

public class CreditCardPaymentService implements PaymentService {

    private String name = "Credit Card";

    public String getName() {
        return this.name;
    }
}
