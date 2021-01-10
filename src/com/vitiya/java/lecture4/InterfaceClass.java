package com.vitiya.java.lecture4;

/**
 * In Java, doesnt support multiple inheritance (Deadly Diamond Problem)
 * Why ?
 * The reason behind this is to prevent ambiguity. Consider a case where class B extends class A and Class C and both class A and C have the same method display(). Now java compiler cannot decide, which display method it should inherit.
 * */

public class InterfaceClass extends Feature implements Controller {


    public InterfaceClass(String name) {
        super(name);
    }

    @Override
    public void add() { }

    @Override
    public void delete() { }

    @Override
    public void update() { }
}

interface Controller {
    void add();
    void delete();
    void update();
}

class Feature {
    private String name;

    public Feature(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

