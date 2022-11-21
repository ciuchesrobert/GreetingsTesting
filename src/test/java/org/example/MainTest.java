package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    @DisplayName("my first test")
    public void firstTest(){
        Assertions.assertTrue(5==5);
    }

    @Test
    @DisplayName("given a time of 21, greeting returns good evening")
    public void givenTime21GreetingReturnGoodEvening(){
        //arrange
        int time = 21;
        String expectedGreeting = "good evening";
        // act
        String result = Main.greetingMethod(time);
        //assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("given a time of 8, greeting returns good evening")
    public void givenTime21GreetingReturnGoodMorning(){
        //arrange
        int time = 8;
        String expectedGreeting = "good morning";
        // act
        String result = Main.greetingMethod(time);
        //assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("given a time of 16, greeting returns good evening")
    public void givenTime21GreetingReturnGoodAfternoon(){
        //arrange
        int time = 16;
        String expectedGreeting = "good afternoon";
        // act
        String result = Main.greetingMethod(time);
        //assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {6,8,12})
    @DisplayName("given a time between 5 and 12, greeting returns good morning")
    public void givenTimeBetween6And12GreetingReturnGoodMorning(int time){
        String expected = "good morning";
        String result = Main.greetingMethod(time);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13,16,18})
    @DisplayName("given a time between 13 and 18, greeting returns good afternoon")
    public void givenTimeBetween6And18GreetingReturnGoodAfternoon(int time){
        String expected = "good afternoon";
        String result = Main.greetingMethod(time);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {19,24,5})
    @DisplayName("given a time between 19 and 15, greeting returns good evening")
    public void givenTimeBetween19And5GreetingReturnGoodEvening(int time){
        String expected = "good evening";
        String result = Main.greetingMethod(time);
        assertEquals(expected, result);
    }
}