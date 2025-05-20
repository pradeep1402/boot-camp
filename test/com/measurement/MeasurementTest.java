package com.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void whenComparingTwoLengthUnits() {
        Measurement<LengthUnit> firstLength = Measurement.create(12, LengthUnit.INCH);
        Measurement<LengthUnit> secondLength = Measurement.create(1, LengthUnit.FEET);
        assertEquals(Measurement.create(24, LengthUnit.INCH), firstLength.add(secondLength));
    }
}
