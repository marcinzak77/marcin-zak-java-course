package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {

    public void orderProcess(Producer producer, Payments payments) {

        if (producer.process() && payments.paymentsProcess()) {
            System.out.println("Ordered: " + producer.getProductName());
        } else {
            System.out.println("Can't process order of: " + producer.getProductName());
        }
    }
}
