package com.measurement;

public interface Unit {
    double toBase(double volume);
    Unit baseUnit();

}
