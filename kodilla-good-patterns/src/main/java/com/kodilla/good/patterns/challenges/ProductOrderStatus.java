package com.kodilla.good.patterns.challenges;

public class ProductOrderStatus {

    public boolean order(final User user, final ProductRepository productRepository, final ShippingService shippingService, final PaymentService paymentService) {
        System.out.println("Product: " + productRepository.getNameOfProduct());
        System.out.println("Order by: " + user.getName() + " " + user.getSurname());
        System.out.println("Shipping address: " + user.getAddress());
        System.out.println("Shipped by: " + shippingService.getName());
        System.out.println("Payment method: " + paymentService.getName());
        return true;
    }
}
