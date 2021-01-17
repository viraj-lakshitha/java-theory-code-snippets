package com.vitiya.java;

public class Circle {

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public String toString() {
        return "Radius of the Circle : "+radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.0);
        System.out.println(c1.toString());
        System.out.println("Area of the Circle : "+c1.findArea());
    }
}