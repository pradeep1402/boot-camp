package com.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void whenHaveSameDimenssion() {
        Rectangle myRectangle = new Rectangle(2, 2);

        assertEquals(4, myRectangle.area());
    }

    @Test
    void whenHaveDifferentDimenssion() {
        Rectangle actual = new Rectangle(2, 3);
        assertEquals(6, actual.area());
    }

    @Test
    void perimeterOfSameDimenssion() {
        Rectangle actual = new Rectangle(2, 2);
        assertEquals(8, actual.perimeter());
    }

    @Test
    void perimeterOfDifferentDimenssion() {
        Rectangle actual = new Rectangle(2, 3);
        assertEquals(10, actual.perimeter());
    }
}