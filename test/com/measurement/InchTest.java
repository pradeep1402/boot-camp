package com.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void isEqual() {
        Inch inch = Inch.create(4);
        Centimeter cm = Centimeter.create(10);
        assertTrue(inch.equals(cm.toBase()));
    }

}