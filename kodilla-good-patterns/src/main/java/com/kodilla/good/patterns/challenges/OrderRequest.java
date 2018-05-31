package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private ProductRepository product;
    private ShippingService shipping;
    private PaymentService payment;

    public OrderRequest(User user, ProductRepository product, ShippingService shipping, PaymentService payment) {
        this.user = user;
        this.product = product;
        this.shipping = shipping;
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public ProductRepository getProduct() {
        return product;
    }

    public ShippingService getShipping() {
        return shipping;
    }

    public PaymentService getPayment() {
        return payment;
    }
}
