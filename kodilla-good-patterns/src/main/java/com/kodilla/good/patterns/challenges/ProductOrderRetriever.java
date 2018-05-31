package com.kodilla.good.patterns.challenges;

public class ProductOrderRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Wayne", "Baker Street 12");
        ProductRepository productRepository = new ShoesProductRepository();
        ShippingService shippingService = new PostOfficeShippingService();
        PaymentService paymentService = new CreditCardPaymentService();

        return new OrderRequest(user, productRepository, shippingService, paymentService);
    }

}
