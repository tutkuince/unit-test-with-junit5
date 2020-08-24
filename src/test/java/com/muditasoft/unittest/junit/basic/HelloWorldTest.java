package com.muditasoft.unittest.junit.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void sayHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.sayHello(), "Say Hello to World!");
    }
}
