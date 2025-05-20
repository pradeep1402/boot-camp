package com.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

    @Test
    void create() {
        Feet feet = Feet.create(3);
        assertInstanceOf(Feet.class, feet);
    }

    @Test
    void isEqual() {
        Feet feet = Feet.create(3);
        Inch inch = Inch.create(36);
        assertTrue(inch.equals(feet.toBase()));
    }
}