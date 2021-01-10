package com.vitiya.java.lecture4;

public class Calculator {

    //This PI variable can't edit,only read access
    static final double PI = 3.14;

    public static void main(String[] args) {
        double perimeter = calculatePerimeter(7);
        System.out.println(perimeter);
    }

    private static double calculatePerimeter(int radius) {
        return 2*PI*radius;
    }
}

/**
 * Similarly final classes can't extends
 * `public final class Person {}`
 * */

final class Rectangle {

}

// class Circle extends Rectangle {
//
// }
