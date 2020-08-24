package com.muditasoft.unittest.junit.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
* Write a program that prints the numbers from 1 to 100.
* But for multiples of three print “Fizz” instead of the number and         - DONE
* for the multiples of five print “Buzz”.                                   - DONE
* For numbers which are multiples of both three and five print “FizzBuzz    - DONE
* */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void return_fizz_when_the_number_is_divided_by_three() {
        assertEquals("Fizz", fizzBuzz.stringFor(3));
    }

    @Test
    void return_buzz_when_the_number_is_divided_by_five() {
        assertEquals("Buzz", fizzBuzz.stringFor(5));
    }

    @Test
    void return_fizzbuzz_when_the_number_is_divided_both_of_three_and_five() {
        assertEquals("FizzBuzz", fizzBuzz.stringFor(15));
    }

    @Test
    void return_the_number_itself_when_the_number_is_not_divided_any_of_three_or_five() {
        assertEquals("7", fizzBuzz.stringFor(7));
    }

    @Test
    void throws_illegal_argument_exception_when_the_number_s_less_than_one_or_greater_than_hundred() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.stringFor(-1));
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.stringFor(101));
    }
}
