package com.vitiya.java.lecture1;

public class Phone {
    private String modelName;
    private int phoneNumber;
}

interface PhoneInterface {
    void call(); // Method to Make Call
    void message(); // Method to Reply or Recived Messages
    Integer calculator(); // Method to perform mathematical operations
    void facebook(); // Method to access Facebook Application
}

abstract class PhoneWithBasicOperations implements PhoneInterface {
    @Override
    public void call() {

    }

    @Override
    public void message() {

    }
}

class PhoneWithAllOperations implements PhoneInterface {
    @Override
    public void call() {

    }
    @Override
    public void message() {

    }
    @Override
    public Integer calculator() {
        return null;
    }
    @Override
    public void facebook() {

    }
}