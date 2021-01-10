package com.vitiya.java.lecture3;


public class InstanceOf {

    public static void main(String[] args) {
        Person p1 = new Person("Viraj",20);
        Animal a1 = new Animal("Golden Retriever","Dog");

        if (p1 instanceof Person) {
            System.out.println("p1 cast to Person");
        }

        if (a1 instanceof Animal) {
            System.out.println("a1 cast to Animal");
        }

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Animal {
    private String bread;
    private String type;

    public Animal(String bread, String type) {
        this.bread = bread;
        this.type = type;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}