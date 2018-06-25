package com.kodilla.rps.service;

public class CreateGameDetails {

    public CreateGameDetails() {

        System.out.println("Please Enter Your Name: ");
        String name = KeyboardReader.getReadString();

        System.out.println("Please Enter Number Of Rounds: ");
        int rounds = Integer.parseInt(KeyboardReader.getReadString());

        new GameDetails(name, rounds);
    }
}
