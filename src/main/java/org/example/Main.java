package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(greetingMethod(getNumberOfHours()));
    }
    public static String greetingMethod(int hours) {
        String greeting;
        if (hours > 5 && hours <= 12) {
            greeting = "good morning";
        } else if (hours > 12 && hours <= 18) {
            greeting = "good afternoon";
        } else greeting = "good evening";
        return greeting;
    }
    private static int getNumberOfHours() {
        System.out.println("Please enter time of day in hours");
        Scanner scanner = new Scanner(System.in);
        int unitNumber = scanner.nextInt();
        if (unitNumber <= 24 && unitNumber > 0) {
            return unitNumber;
        } else {
            System.out.println("Please enter a valid of the day from 0 to 23");
            scanner = new Scanner(System.in);
            unitNumber = scanner.nextInt();
        }
        return unitNumber;
    }
}