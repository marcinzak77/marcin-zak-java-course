package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceRunner {

    public static void main(String[] args) {

        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        OrderRequest productOrder = productOrderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), productOrder);
        productOrderService.process(productOrder);
    }
}
