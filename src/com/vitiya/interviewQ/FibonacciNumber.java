package com.vitiya.interviewQ;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(checkFibonacci(5));
    }

    public static int checkFibonacci(int num) {
        if (num == 1) {
            return num;
        }

        return (num-1) + (num-2);
    }

}
