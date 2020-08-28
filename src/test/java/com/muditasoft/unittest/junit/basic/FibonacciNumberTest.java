package com.muditasoft.unittest.junit.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 1 1 2 3 5 8
public class FibonacciNumberTest {

    @Test
    @DisplayName("Find fibonacci Numbers for Specific Orders")
    void find_fibonacci_numbers() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        assertThrows(IllegalArgumentException.class, () -> fibonacciNumber.find(0));

        assertAll("Fibonacci numbers",
                () -> assertEquals(1, fibonacciNumber.find(1)),
                () -> assertEquals(1, fibonacciNumber.find(2)),
                () -> assertEquals(2, fibonacciNumber.find(3)),
                () -> assertEquals(3, fibonacciNumber.find(4)),
                () -> assertEquals(5, fibonacciNumber.find(5))
                );
    }
}
