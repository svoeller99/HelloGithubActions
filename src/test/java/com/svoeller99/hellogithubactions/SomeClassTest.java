package com.svoeller99.hellogithubactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeClassTest {
    @Test
    public void testSomeClass() {
        var name = "Sean";
        var somePojo = new SomeClass(name);
        assertEquals(name, somePojo.getName(), "name should match expected");
    }
}