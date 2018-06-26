package com.kodilla.rps.service;

import com.kodilla.rps.shapes.Shape;
import com.kodilla.rps.shapes.MoveFactory;

public class GameRound {

    public boolean GameRound(String option) {

        if (option.toLowerCase().equals("x")) {
            System.out.println("Exit Game");
            if (Confirmation.confirm(option)) {
               return true;
            }
        } else if (option.toLowerCase().equals("n")) {
                System.out.println("New Game");
                if (Confirmation.confirm(option)) {
                    GameStarter gameStarter = new GameStarter();
                    gameStarter.startGame();
                    return true;
                }
        }

        MoveFactory factory = new MoveFactory();
        Shape shapeOne = factory.makeShape(option);
        Shape shapeTwo = factory.makeShape("random");
        CheckShapes checkShapes = new CheckShapes();
        String results = checkShapes.checkShapes(shapeOne, shapeTwo);
        System.out.println("Winner is: " + results);
        return false;
    }
}
