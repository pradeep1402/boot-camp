package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRectangleTest {
    @Test
    void whenHaveSameDimenssion() {
        MyRectangle myRectangle = new MyRectangle(2, 2);

        assertEquals(4, myRectangle.area());
    }

    @Test
    void whenHaveDifferentDimenssion() {
        MyRectangle actual = new MyRectangle(2, 3);
        assertEquals(6, actual.area());
    }

    @Test
    void perimeterOfSameDimenssion() {
        MyRectangle actual = new MyRectangle(2, 2);
        assertEquals(8, actual.perimeter());
    }

    @Test
    void perimeterOfDifferentDimenssion() {
        MyRectangle actual = new MyRectangle(2, 3);
        assertEquals(10, actual.perimeter());
    }
}