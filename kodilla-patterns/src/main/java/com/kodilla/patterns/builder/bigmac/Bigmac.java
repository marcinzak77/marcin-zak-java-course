package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("bun with sesame") || bun.equals("bun without sesame")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Only 'bun with sesame' or 'bun without sesame', are available!");
            }

            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers>0 && burgers<3) {
                this.burgers = burgers;
            } else {
                throw new IllegalStateException("Only 1 or 2 burgers are available!");
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            List<String> sauceList = new ArrayList<>(Arrays.asList("standard" , "1000 islands" , "barbecue"));
            if (sauceList.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce not avaiable. Choose from: " + sauceList);
            }

            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            List<String> ingredientsList = new ArrayList<>(Arrays.asList("lettuce" , "onion" , "bacon" , "cucumber" , "chilli peppers" , "mushrooms" , "shrimps" , "cheese"));
            if (ingredientsList.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Can't add " + ingredient + ". Ingredient not available on the list");
            }
            return this;
        }
        
        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
