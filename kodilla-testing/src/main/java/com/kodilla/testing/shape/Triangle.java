package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double height;
    private double weight;

    public Triangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (height * weight)/2;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
