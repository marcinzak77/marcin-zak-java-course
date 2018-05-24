package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(5.0, 5.0));
        } catch(Exception e) {
            System.out.println("Numbers out of range!");
        } finally {
            System.out.println("End of program");
        }
    }
}
