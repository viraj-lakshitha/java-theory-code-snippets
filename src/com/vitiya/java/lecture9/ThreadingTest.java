//package com.vitiya.java.lecture9;
//
///**
// * Multithreading
// * 1. Using 'extends Thread' - Scheduler(Part of JVM) decide how to run the program , whether Round Robbing, First come First Serve
// * 2. Using Runnable Thread
// **/
//
//public class ThreadingTest {
//    public static void main(String[] args) throws InterruptedException {
////        MyThread myThread1 = new MyThread();
////        myThread1.start();
//
//        MyRunnable runnable = new MyRunnable();
//        Thread myThread2 = new Thread(runnable);
//        myThread2.start();
//        myThread2.sleep(3000); // Temporarily Sleep for 3 Sec
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Main "+i);
//        }
//    }
//
//
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for  (int i=0; i < 5; i++) {
//            System.out.println("MyThread "+i);
//        }
//    }
//}
//
//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        for  (int i=0; i < 5; i++) {
//            System.out.println("Runnable "+i);
//        }
//    }
//}
