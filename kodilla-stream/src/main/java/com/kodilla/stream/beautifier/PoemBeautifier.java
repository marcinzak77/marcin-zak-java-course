package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator){
        String results = poemDecorator.decorate(textToDecorate);
        System.out.println(results);
    }
}
