package com.measurement;

import java.util.Objects;

public class Centimeter {
    private final int cm;

    private Centimeter(int cm) {
        this.cm = cm;
    }

    public static Centimeter create(int cm) {
        return new Centimeter(cm);
    }

    public Inch toBase() {
        return Inch.create((2 * this.cm) / 5);
    }

}
