package com.github.hcsp.polymorphism;

public class Square extends Shape{
    // 正方形的边长
    private double sideLength;

    @Override
    public double getArea() {
        return Math.pow(sideLength,2);
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
}
