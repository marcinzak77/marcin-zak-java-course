package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private final List<Continent> allcontinents;

    public World(final List<Continent> allcontinents) {
        this.allcontinents = allcontinents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity;
        peopleQuantity = allcontinents.stream()
                .flatMap(Country -> Country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (total, current) -> total.add(current));
        return peopleQuantity;
    }

    public List<Continent> getAllcontinents() {
        return allcontinents;
    }
}
