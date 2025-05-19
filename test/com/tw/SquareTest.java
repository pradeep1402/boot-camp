package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void areaOfSquareOfSideZero() {
        Square actual = new Square(0);
        assertEquals(0, actual.area());
    }

    @Test
    void areaOfSquare() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    void perimeterOfSquareOfSideZero() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }

    @Test
    void perimeterOfSquare() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
    }
}