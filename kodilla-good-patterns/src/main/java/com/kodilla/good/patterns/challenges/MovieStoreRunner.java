package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        List<String> theResults = movieStore.getMovies().entrySet().stream()
                .flatMap(booksTitlesWithTranslations -> booksTitlesWithTranslations.getValue().stream())
                .collect(Collectors.toList());

        theResults.stream()
                .forEach(s -> System.out.print(s+ "!"));
    }
}
