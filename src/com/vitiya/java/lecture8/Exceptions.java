package com.vitiya.java.lecture8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * * Try/Catch block
 * Exception handling mechanism:
 * Find the problem (try block : Hit the exception)
 * Inform that an error has occurred (Throw the exception)
 * Receive the error information (Catch the exception)
 * Take corrective action (handle the exception)
 * */


public class Exceptions {

    public static void main(String[] args) {

        Scanner USER_INPUT = new Scanner(System.in);

//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//        }

        checkAge(20);

    }// End of the main class

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}// End of the exceptions class
