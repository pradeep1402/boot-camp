package com.measurement;

public class Feet {
    private final int feet;

    private Feet(int feet) {
        this.feet = feet;
    }

    public static Feet create(int feet) {
        return new Feet(feet);
    }

    public Inch toBase() {
        return Inch.create(this.feet * 12);
    }
}
