package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRequest orderRequest;

    public ProductOrderService(final InformationService informationService, final OrderRequest orderRequest) {
        this.informationService = informationService;
        this.orderRequest = orderRequest;

    }

    public OrderDto process(final OrderRequest orderRequest) {
        ProductOrderStatus productOrderStatus = new ProductOrderStatus();
        boolean isProcessed =  productOrderStatus.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getShipping(), orderRequest.getPayment());
        if (isProcessed) {
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
