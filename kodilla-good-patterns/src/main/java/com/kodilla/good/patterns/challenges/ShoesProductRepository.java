package com.kodilla.good.patterns.challenges;

public class ShoesProductRepository implements ProductRepository {

    private String nameOfProduct = "Shoes";

    public String getNameOfProduct() {
        return this.nameOfProduct;
    }
}
