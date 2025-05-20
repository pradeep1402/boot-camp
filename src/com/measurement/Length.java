package com.measurement;

import java.util.Objects;

public class Length {
    private static final double FROMINCH = 1;
    private static final double FROMFEET = 12;
    private static final double FROMCM = 2.0 / 5.0;
    private static final double FROMMM = 1.0 / 25.0;
    private final double inch;

    private Length(double inch) {
        this.inch = inch;
    }

    public static Length fromInch(double inch) {
        return Length.create(inch, Length.FROMINCH);
    }

    public static Length fromFeet(double feet) {
        return Length.create(feet, Length.FROMFEET);
    }

    public static Length fromCm(double cm) {
        return Length.create(cm, Length.FROMCM);
    }

    public static Length fromMm(double mm) {
        return Length.create(mm, Length.FROMMM);
    }

    private static Length create(double length, double factor) {
        return new Length(length * factor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(inch, length.inch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }
}
