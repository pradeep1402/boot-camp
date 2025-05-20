package com.measurement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void oneLitreIsEqualsOneLitre() throws InvalidMeasurement {
        assertTrue(Volume.litre(1).equals(Volume.litre(1)));
    }

    @Test
    void whenStoreInvalidLitre() throws InvalidMeasurement {
        assertThrows(InvalidMeasurement.class, () -> Volume.litre(-1));
    }

    @Test
    void oneLitreIsEqualsThreeGallon() throws InvalidMeasurement {
        Volume litre = Volume.litre(1);
        Volume gallon = Volume.gallon(3.78);
        assertTrue(litre.equals(gallon));
    }

    @Test
    void oneGallonIsEqualsOneGallon() throws InvalidMeasurement {
        assertTrue(Volume.gallon(1).equals(Volume.gallon(1)));
    }

    @Test
    void whenStoreInvalidGallon() {
        assertThrows(InvalidMeasurement.class, () -> Volume.gallon(-1));
    }
}