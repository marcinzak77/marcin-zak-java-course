package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal population;

    public Country(final String countryName, final long population) {
        this.countryName = countryName;
        this.population = new BigDecimal(population);
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    public String getCountryName() {
        return countryName;
    }
}
