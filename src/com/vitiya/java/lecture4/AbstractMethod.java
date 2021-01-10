package com.vitiya.java.lecture4;

/**
 * You can extend (subclass) an abstract class
 * If the subclass defines all the inherited abstract methods, it is “complete” and can be instantiated
 * If the subclass does not define all the inherited abstract methods, it must be abstract too
 *
 * You can declare a class to be abstract even if it does not contain any abstract methods
 * */

public abstract class AbstractMethod {
    //you can declare a method without defining it
    public abstract void draw(int size);

}
