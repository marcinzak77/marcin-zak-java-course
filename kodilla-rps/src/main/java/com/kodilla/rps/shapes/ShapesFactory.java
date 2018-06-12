package com.kodilla.rps.shapes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean(name = "paper")
    public Paper createPaper() {
        return new Paper();
    }

    @Bean(name = "rock")
    public Rock createRock() {
        return new Rock();
    }

    @Bean(name = "scissors")
    public Scissors createScissors() {
        return new Scissors();
    }

    @Bean(name = "randomShape")
    public Shape randomShape() {
        Random generator = new Random();
        int randomNumber = generator.nextInt(3);

        if (randomNumber == 0) {
            return new Paper();
        } else if (randomNumber == 1) {
            return new Rock();
        } else {
            return new Scissors();
        }
    }
}
