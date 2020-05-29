package net.jbw.playground.greeting.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplEnglishTest {
    @Test
    public void testSaysHello() {
        String result = new GreetingImplEnglish().sayHello("English");
        assertEquals("Hello, English!", result);
    }
}
