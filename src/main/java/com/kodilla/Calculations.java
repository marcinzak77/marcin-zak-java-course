package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {

    private double averageFromIntegerList(List<Integer> theList) {
        int sumOfInteger = 0;
        for (int number : theList) {
            sumOfInteger += number;
        }
        return (double) sumOfInteger / theList.size();
    }

    private ArrayList<Integer> getAllGradesAsList(Grades grades) {
        ArrayList<Integer> allGrades = new ArrayList();
        for (int grade : grades.getMaths()) {
            allGrades.add(grade);
        }
        for (int grade : grades.getPhysics()) {
            allGrades.add(grade);
        }
        for (int grade : grades.getEnglish()) {
            allGrades.add(grade);
        }
        return allGrades;
    }

    public double calculateBestAverage(Map<Student, Grades> scores) {
        double total = 0;

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double average = averageFromIntegerList(getAllGradesAsList(entry.getValue()));
            if (total < average) total = average;
        }
        return total;
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {
        List<String> results = new ArrayList<>();
        double total = 0;
        String name = null;

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double average = averageFromIntegerList(getAllGradesAsList(entry.getValue()));
            if (total < average) {
                total = average;
                name = entry.getKey().getFirstName() + " " + entry.getKey().getLastName();
            }
        }
        results.add(name);
        return results;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        List<Student> resultList = new ArrayList<>();
        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            if (entry.getKey().getLanguage() != null
                    && entry.getKey().getLanguage().equals("PL")
                    && averageFromIntegerList(entry.getValue().getMaths()) > 4) {
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }

}