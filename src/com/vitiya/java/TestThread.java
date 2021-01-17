package com.vitiya.java;

class Threading extends Thread {
    public void run() {
        for ( int i = 0; i < 5; i++) {
            System.out.println("Second Thread "+i);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        for ( int i = 0; i < 5; i++) {
            System.out.println("First Thread "+i);
        }

        Threading t1 = new Threading();
        t1.start();
    }
}
