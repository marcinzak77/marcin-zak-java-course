package com.kodilla.rps.service;

public class CreateGameDetails {

    public CreateGameDetails() {

        KeyboardReader keyboardReader = new KeyboardReader();

        System.out.println("Please Enter Your Name: ");
        String name = keyboardReader.getReadString();

        System.out.println("Please Enter Number Of Rounds: ");
        int rounds = Integer.parseInt(keyboardReader.getReadString());

        GameDetails gameDetails = new GameDetails(name, rounds);
    }
}
