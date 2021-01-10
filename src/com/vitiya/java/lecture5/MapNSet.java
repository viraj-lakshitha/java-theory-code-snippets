package com.vitiya.java.lecture5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The Set interface provides an unordered collection of unique objects, i.e.
 * Set doesn't allow duplicates, while Map provides a data structure based on
 * key-value pair and hashing.
 * */

/**
 * A Set is a collection, it is an unordered list  and has no duplicates.
 * You can't say new Set() , cuz it's interface
 * Suitable for the application that doesnt want duplications
 *
 * Types : HashSet, TreeSet, LinkedHashSet, AbstractSet
 * */

/**
 * A Map is an object that maps keys to values
 * A map cannot contain duplicate keys and each key can map to at most one value
 *
 * HashMap is the faster
 * TreeMap guarantees the order of iteration
 * */

public class MapNSet {

    public static void main(String[] args) {

        Set newSet = new HashSet();

        Map<String, String> map = new HashMap<>();
        map.put("Viraj","Undergraduate"); //First parameter is key and second parameter is the value

    }
}
