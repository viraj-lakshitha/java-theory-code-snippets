package com.vitiya.java.lecture9;


class Counter{
    int count;

    public synchronized void incCount() { count++; } // Synchronized
    //public void incCount() { count++; } // Non-synchronized
}

public class SynchronizationTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        //One Thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.incCount();
                }
            }
        });

        //Two Thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.incCount();
                }
            }
        });

         t1.start();
         t2.start();
         t1.join(); // Hold the Thread until thread ends
         t2.join(); // Hold the Thread until thread ends
        System.out.println("Counter of the count : "+ counter.count);  // Expected Answer

        //Data Inconsistency occurs, due to run running two threads parallel
        // When update incCount in COuter class as synchronized then , it will ensure data inconsistency
    }
}
