package com.measurement;

import java.util.Objects;

public class Inch {
    private final int inch;

    private Inch(int inch) {
        this.inch = inch;
    }

    public static Inch create(int inch) {
        return new Inch(inch);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch1 = (Inch) o;
        return inch == inch1.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }
}
