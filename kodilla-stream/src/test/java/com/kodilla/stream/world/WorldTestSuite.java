package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        // Given
        List<Country> theAfricanCountries = new ArrayList<>();

        theAfricanCountries.add(new Country("Egipt", 95690000));
        theAfricanCountries.add(new Country("Senegal", 15410000));
        theAfricanCountries.add(new Country("Congo", 78740000));

        // When
        BigDecimal totalPopulation = new BigDecimal("0");
        for (Country country:  theAfricanCountries) {
            totalPopulation = totalPopulation.add(country.getPeopleQuantity());
        }

        // Then
        BigDecimal expectedPopulation = new BigDecimal("189840000");
        assertEquals(expectedPopulation,totalPopulation);
    }

    @Test
    public void testPeopleQuantityAll() {
        // Given
        List<Continent> theWorld = new ArrayList<>();
        List<Country> theEuropeanCountries = new ArrayList<>();
        List<Country> theAsianCountries = new ArrayList<>();
        List<Country> theAfricanCountries = new ArrayList<>();
        List<Country> theSouthAmericanCountries = new ArrayList<>();

        theEuropeanCountries.add(new Country("Poland", 37950000));
        theEuropeanCountries.add(new Country("Germany", 826700000));
        theEuropeanCountries.add(new Country("France", 66900000));

        theAsianCountries.add(new Country("China", 1379000000));
        theAsianCountries.add(new Country("Japan", 127000000));
        theAsianCountries.add(new Country("Vietnam", 92700000));

        theAfricanCountries.add(new Country("Egipt", 95690000));
        theAfricanCountries.add(new Country("Senegal", 15410000));
        theAfricanCountries.add(new Country("Congo", 78740000));

        theSouthAmericanCountries.add(new Country("Brasil", 207700000));
        theSouthAmericanCountries.add(new Country("Colombia", 48650000));
        theSouthAmericanCountries.add(new Country("Argentina", 43850000));

        theWorld.add(new Continent(theEuropeanCountries));
        theWorld.add(new Continent(theAsianCountries));
        theWorld.add(new Continent(theAfricanCountries));
        theWorld.add(new Continent(theSouthAmericanCountries));

        // When
        World world = new World(theWorld);
        BigDecimal totalPopulation;
        totalPopulation = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPopulation = new BigDecimal("3020290000");
        assertEquals(expectedPopulation,totalPopulation);
    }
}
