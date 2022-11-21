package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassificationTests {
    @ParameterizedTest
    @ValueSource(ints = {4, 8, 11})
    @DisplayName("Considering the age, these are the films you are allowed to watch")
    public void givenAgeUnder12(int age) {
        String expected = "U, and PG films are available." +
                " 12A films are available if accompanied by an adult.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    @DisplayName("Considering the age, these are the films you are allowed to watch")
    public void givenAgeUnder15(int age) {
        String expected = "U, PG, 12A and 12 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    @DisplayName("Considering the age, these are the films you are allowed to watch")
    public void givenAgeUnder18(int age) {
        String expected = "U, PG, 12A, 12 and 15 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 24, 55})
    @DisplayName("Considering the age, these are the films you are allowed to watch")
    public void givenAgeOver18(int age) {
        String expected = "All films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }
}
