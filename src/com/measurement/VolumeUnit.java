package com.measurement;

public enum VolumeUnit implements Unit {
    GALLON(3.78), LITER(1);

    private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double toBase(double volume) {
        return factor * volume;
    }

    @Override
    public Unit baseUnit() {
        return LITER;
    }
}
