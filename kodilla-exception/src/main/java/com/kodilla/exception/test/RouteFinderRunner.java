package com.kodilla.exception.test;

public class RouteFinderRunner {
    public static void main(String[] args) {
        RouteFinder routeFinder = new RouteFinder();
        Flight flight1 = new Flight("London", "Paris");

        try {
            routeFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("The end");
        }
    }
}
