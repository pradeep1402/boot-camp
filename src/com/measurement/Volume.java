package com.measurement;

import java.util.Objects;

public class Volume {
    private static final double FROMGALLON = 1 / 3.78;
    private static final double FROMLITER = 1.0;
    private final double litre;

    private Volume(double litre) {
        this.litre = litre;
    }

    private static Volume create(double litre, double factor) throws InvalidMeasurement {
        if (litre < 0) {
            throw new InvalidMeasurement();
        }
        return new Volume(litre * factor);
    }

    public static Volume litre(double litre) throws InvalidMeasurement {
        return create(litre, Volume.FROMLITER);
    }

    public static Volume gallon(double gallon) throws InvalidMeasurement {
        return create(gallon, Volume.FROMGALLON);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(litre, volume.litre) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(litre);
    }
}