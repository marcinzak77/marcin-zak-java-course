package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GlutenFreeShopProducer implements Producer {

    private List<String> productBase = new ArrayList<>(Arrays.asList("GF Product 1", "GF Product 2"));
    private String productName;
    private int quantity;

    public GlutenFreeShopProducer(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public boolean process() {
        if (productBase.contains(productName) && quantity > 99) {
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
