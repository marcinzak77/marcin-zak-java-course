package com.kodilla.rps.shapes;

import java.util.Random;

public final class ShapesFactory {
    public static final String PAPER = "PAPER";
    public static final String ROCK = "ROCK";
    public static final String SCISSORS = "SCISSORS";

    public final Shape makeShape(final String shapeName) {

        switch (shapeName) {

            case (PAPER):
                return new Paper();
            case (ROCK):
                return new Rock();
            case (SCISSORS):
                return new Scissors();
            default:
                Random generator = new Random();
                int randomNumber = generator.nextInt(3);

                if (randomNumber == 0) {
                    return new Paper();
                } else if (randomNumber == 1) {
                    return new Rock();
                } else {
                    return new Scissors();
                }
        }

    }
}
