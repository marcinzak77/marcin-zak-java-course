package com.kodilla.rps.service;

import com.kodilla.rps.shapes.Shape;
import com.kodilla.rps.shapes.ShapesFactory;

public class GameRound {

    public boolean GameRound(String option) {

        if (option.toLowerCase().equals("x")) {
            System.out.println("Are You sure that you want finish this game ? [Y]es/{N]o");
            char response = KeyboardReader.getReadString().toLowerCase().charAt(0);
            if (response == 'y') {
               return true;
            }
         }

        ShapesFactory factory = new ShapesFactory();
        Shape shapeOne = factory.makeShape(option);
        Shape shapeTwo = factory.makeShape("random");
        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(shapeOne, shapeTwo);
        System.out.println("Winner is: " + results);
        return false;
    }
}
