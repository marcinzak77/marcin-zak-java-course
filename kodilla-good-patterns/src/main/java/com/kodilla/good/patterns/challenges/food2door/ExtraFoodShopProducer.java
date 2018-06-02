package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraFoodShopProducer implements Producer {

    private List<String> productBase = new ArrayList<>(Arrays.asList("EF Product 1", "EF Product 2"));
    private String productName;
    private int quantity;

    public ExtraFoodShopProducer(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public boolean process() {
        if (productBase.contains(productName) && quantity > 0) {
            return true;
        }
        return false;
    }

    public List<String> getProductBase() {
        return productBase;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
