package net.jbw.playground.greeting.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplGermanTest {
    @Test
    public void testSaysHallo() {
        String result = new GreetingImplGerman().sayHello("German");
        assertEquals("Hallo, German!", result);
    }
}
