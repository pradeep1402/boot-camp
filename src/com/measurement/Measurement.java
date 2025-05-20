package com.measurement;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double magnitude;
    private final T unit;

    public Measurement(T unit, double magnitude) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Measurement create(double length, Unit unit) {
        return new Measurement(unit, length);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement length = (Measurement) o;
        return Double.compare(this.unit.toBase(this.magnitude), length.unit.toBase(length.magnitude)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(magnitude);
    }

    public <U extends Unit>Measurement<T> add(Measurement<T> length2) {
        return Measurement.create(this.unit.toBase(this.magnitude) + length2.unit.toBase(length2.magnitude), this.unit.baseUnit());
    }
}
