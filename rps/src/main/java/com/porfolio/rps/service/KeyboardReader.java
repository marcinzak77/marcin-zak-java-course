package com.porfolio.rps.service;

import java.util.Scanner;

public class KeyboardReader {


    public static String getReadString() {

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();

        return readString;
    }
}
