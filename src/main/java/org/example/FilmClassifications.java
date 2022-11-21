package org.example;

import java.util.Scanner;

public class FilmClassifications {

    public static void main(String[] args) {
        System.out.println(availableClassifications(getAge()));
    }

    public static String availableClassifications(int ageOfViewer) {
        String result;
        if (ageOfViewer < 12) {
            result = "U, and PG films are available. " +
                    "12A films are available if accompanied by an adult.";
        } else if (ageOfViewer < 15) {
            result = "U, PG, 12A and 12 films are available.";
        } else if (ageOfViewer < 18) {
            result = "U, PG, 12A, 12 and 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }

    public static int getAge() {
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
