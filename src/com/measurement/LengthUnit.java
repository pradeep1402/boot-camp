package com.measurement;

public enum LengthUnit implements Unit {
    INCH(1), FEET(12), CM(2.0 / 5.0), MM(1.0 / 25.0);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double toBase(double length) {
        return factor * length;
    }

    @Override
    public Unit baseUnit() {
        return INCH;
    }
}
