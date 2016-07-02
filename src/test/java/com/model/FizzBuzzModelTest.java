package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brallan on 01/07/16.
 */
public class FizzBuzzModelTest {

    private FizzBuzzModel fizzBuzz = new FizzBuzzModel();

    @Test
    public void play() throws Exception {
        assertEquals("1", fizzBuzz.play(1));
        assertEquals("2", fizzBuzz.play(2));
        assertEquals("Fizz", fizzBuzz.play(3));
        assertEquals("4", fizzBuzz.play(4));
        assertEquals("Buzz", fizzBuzz.play(5));
        assertEquals("Fizz", fizzBuzz.play(6));
        assertEquals("7", fizzBuzz.play(7));
        assertEquals("8", fizzBuzz.play(8));
        assertEquals("Fizz", fizzBuzz.play(9));
        assertEquals("Buzz", fizzBuzz.play(10));
        assertEquals("FizzBuzz", fizzBuzz.play(15));
        assertEquals("FizzBuzz", fizzBuzz.play(4755));
        assertEquals("FizzBuzz", fizzBuzz.play(765));
        assertEquals("FizzBuzz", fizzBuzz.play(90));
    }
}