package com.measurement;

public class InvalidMeasurement extends Exception {
    public InvalidMeasurement() {
        super("impossible measurement");
    }
}
