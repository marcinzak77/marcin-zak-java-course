package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> allFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        allFigures.add(shape);
    }

    public void removeFigure(Shape shape) {
        allFigures.remove(shape);
    }

    public String getFigure(int n) {
        Shape figure = allFigures.get(n);
        return figure.getShapeName();
    }

    public ArrayList<String> showFigures() {
        ArrayList<String> figures = new ArrayList<>();
        for (Shape figure: allFigures) {
            figures.add(figure.getShapeName());
        }
        return figures;
    }

    public ArrayList getAllFigures() {
        return allFigures;
    }
}
