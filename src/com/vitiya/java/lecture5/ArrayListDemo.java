package com.vitiya.java.lecture5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //String Array
        String[] word = new String[5]; // 5 means the size of the list, only with strings
        word[0] = "Viraj";
        String indexOfOne = word[1]; // Returns null, cuz only one value enter to the array

        // Integer Array
        Integer[] numbers = new Integer[5]; // 5 means the size of the array, only with integers
        numbers[0] = 10;

        //List declared as String, therefore list accept only strings.
        List<String> array = new ArrayList<>();

        //Add Element to the List
        array.add("Viraj");
        array.add("Lakshitha");
        array.add("Bandara");
        System.out.println(array);

        //Accessing Element
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

        //Delete Element
        array.remove(1); //Delete Lakshitha Keyword
        System.out.println(array);

        //Length of List
        System.out.println("Size of List : " + array.size());
    }

}
