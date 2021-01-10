package com.vitiya.java.lecture5;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue :
 * A collection whose elements are added at one end (the rear or tail of the queue) and removed from the other end (the front or head of the queue)
 * A queue is a FIFO (first in, first out) data structure
 *
 * When adding elements, then it added to the ends
 * When removing elements, then it remove from the start
 *
 *
 * dequeue : Removes an element from the front of the queue
 * enqueue : Adds an element to the rear of the queue
 * first : Examines the element at the front of the queue
 * isEmpty : Determines whether the queue is empty
 * size : Determines the number of elements in the queue
 * toString : Returns a string representation of the queue
 * */

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Java");
        queue.add("Angular");
        queue.add("Spring");
        queue.add("React");

        System.out.println(queue); // all the elements in queue
        System.out.println(queue.peek()); // first elements of queue
        System.out.println(queue.size()); // size of the queue

        queue.remove(); // remove the first element of the queue
        System.out.println(queue); // all the elements in queue
        queue.remove("Spring"); // remove specified elements
        System.out.println(queue); // all the elements in queue

        Iterator iterator = queue.iterator(); // Print all the elements using iterator

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
