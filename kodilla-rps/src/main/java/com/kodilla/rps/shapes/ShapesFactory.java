package com.kodilla.rps.shapes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean(name = "paper")
    @Scope("prototype")
    public Paper createPaper() {
        return new Paper();
    }

    @Bean(name = "rock")
    @Scope("prototype")
    public Rock createRock() {
        return new Rock();
    }

    @Bean(name = "scissors")
    @Scope("prototype")
    public Scissors createScissors() {
        return new Scissors();
    }

    @Bean(name = "randomShape")
    @Scope("prototype")
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
