package com.kodilla.rps.service;

public class Confirmation {

    public static boolean confirm(String option) {

            System.out.println("Are You sure? [Y]es/{N]o");
            char response = KeyboardReader.getReadString().toLowerCase().charAt(0);
            if (response == 'y') {
                return true;
            }

        return false;
    }
}
