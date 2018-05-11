package com.kodilla.testing.shape;

public class Square implements Shape {

    private double height;
    private double weight;

    public Square(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return height * weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
