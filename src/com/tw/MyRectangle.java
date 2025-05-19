package com.tw;

public class MyRectangle implements ClosedShapes {
    private final int length;
    private final int breadth;

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int area() {
        return this.length * this.breadth;
    }

    @Override
    public int perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
