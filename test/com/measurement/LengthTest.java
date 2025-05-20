package com.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void checkOneFeetEqualsTo12Inch() {
        assertEquals(Length.fromFeet(1), Length.fromInch(12));
    }

    @Test
    void checkTwoInchEqualsTo5cm() {
        assertEquals(Length.fromInch(2), Length.fromCm(5));
    }

    @Test
    void checkTenMMEqualsToOneCM() {
        assertEquals(Length.fromMm(10), Length.fromCm(1));
    }

    @Test
    void oneInchAddOneInchGiveTwoInch() {
        Length length1 = Length.fromInch(1);
        Length length2 = Length.fromInch(1);

        assertEquals(Length.fromInch(2),length1.add(length2));

    }
}