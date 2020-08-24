package com.muditasoft.unittest.junit.basic;

import org.junit.jupiter.api.*;

import java.util.Random;

public class StandardTestClass {

    private static String oneInstancePerClass;
    private Integer oneInstancePerMethod;

    @BeforeAll
    static void beforeAll() {
        oneInstancePerClass = String.valueOf(new Random().nextInt());
        System.out.println("Init Before All Test Method");
    }

    @AfterAll
    static void afterAll() {
        oneInstancePerClass = null;
        System.out.println("Tear Down All Test Method");
    }

    @BeforeEach
    void setUp() {
        oneInstancePerMethod = new Random().nextInt();
        System.out.println("Init Before Each Method");
    }

    @AfterEach
    void tearDown() {
        oneInstancePerMethod = null;
        System.out.println("Tear Down After Each Test Method");
    }

    @Test
    void test_something_1() {
        System.out.println("Test: test_something_1" + oneInstancePerMethod + ":" + oneInstancePerClass);
    }

    @Test
    void test_something_2() {
        System.out.println("Test: test_something_2" + oneInstancePerMethod + ":" + oneInstancePerClass);
    }

    @Test
    @Disabled("This test is not in scope for now")
    void test_something_3() {
        System.out.println("Test: test_something_3");
    }
}
