package com.measurement;

public class Millimeter {
    private final int mm;

    private Millimeter(int mm) {
        this.mm = mm;
    }

    public static Millimeter create(int mm) {
        return new Millimeter(mm);
    }

    public Inch toBase() {
        return Centimeter.create(this.mm / 10).toBase();
    }
}
