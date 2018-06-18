package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredients("bacon")
                .ingredients("onion")
                .build();

        //When
        int ingredientsAmount = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, ingredientsAmount);
    }
}
