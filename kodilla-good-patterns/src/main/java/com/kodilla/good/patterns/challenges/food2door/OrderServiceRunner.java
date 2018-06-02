package com.kodilla.good.patterns.challenges.food2door;

public class OrderServiceRunner {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        System.out.println("Ordering product 1:");
        orderService.orderProcess(new HealthyShopProducer("HS Product 1", 50), new WireTransferPayments(100.00, true));

        System.out.println("Ordering product 2:");
        orderService.orderProcess(new GlutenFreeShopProducer("GF Product 1", 50), new WireTransferPayments(50, true));
    }
}
