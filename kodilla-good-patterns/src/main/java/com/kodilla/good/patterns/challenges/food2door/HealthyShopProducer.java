package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthyShopProducer implements Producer{
    private List<String> productBase = new ArrayList<>(Arrays.asList("HS Product 1", "HS Product 2"));
    private String productName;
    private int quantity;

    public HealthyShopProducer(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public boolean process() {
        if (productBase.contains(productName) && (quantity > 9 && quantity < 101)) {
            return true;
        }
        return false;
    }

    public List<String> getProductBase() {
        return productBase;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
