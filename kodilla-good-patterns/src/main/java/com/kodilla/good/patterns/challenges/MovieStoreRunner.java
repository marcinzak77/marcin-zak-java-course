package com.kodilla.good.patterns.challenges;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(booksTitlesWithTranslations -> booksTitlesWithTranslations.getValue().stream())
                .forEach(s -> System.out.print(s+ "!"));
    }
}
