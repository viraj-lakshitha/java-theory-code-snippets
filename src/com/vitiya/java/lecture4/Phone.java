package com.vitiya.java.lecture4;

public class Phone {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple Iphone 13", 2020);
        System.out.println((m1.toString()));


    }
}

class Mobile {
    private String brand;
    private int publishYear;

    public Mobile (String brand, int publishYear) {
        this.brand = brand;
        this.publishYear = publishYear;
    }

    public String getBrand() {
        return brand;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() { // This is mostly used for debugging
        return "Phone Brand : "+brand+" | Published Year : "+publishYear;
    }
}
