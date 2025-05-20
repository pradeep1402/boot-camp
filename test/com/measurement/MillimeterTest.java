package com.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillimeterTest {
    @Test
    void isEqual() {
        Centimeter cm = Centimeter.create(5);
        Millimeter mm = Millimeter.create(50);
        assertTrue(cm.toBase().equals(mm.toBase()));
    }
}