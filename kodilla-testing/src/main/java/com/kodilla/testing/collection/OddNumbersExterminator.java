package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int newNumbers: numbers) {
            if (newNumbers % 2 == 0) {
                oddNumbers.add(newNumbers);
            }
        }
        return oddNumbers;
    }

}
