package com.vitiya.java.lecture1;

/**
 * Use Lower CamelCase for the Variable Naming Conventions
 * Use Upper CamelCase for the Class Naming Conventions
 * */

public class BankAccount {

    //Private Methods : Can't access outside this class
    private double balance;
    private String accountNum;

    /**
     * Method of Declaring instance method
     * eg : public void deposit(double amount) {}
     * public -  access modifier
     * void - return type (void means nothing returns, if String then , String should return)
     * deposit - name of the instance method
     * double amount - list of parameters ( type of parameter and name of the parameter )
     * */
    //Public Methods : Can access outside this class
    public void withdraw(double amount) { }

    public void deposit(double amount) { }

    public void close() {}

    //Getter and Setter : Access Modifier - Public
    public String getAccountNum() {
        return accountNum;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * Constructor
     * Rules for Constructor :
     *  1. Constructor name must be the same as its class name
     *  2. A Constructor must have no explicit return type
     *  3. A Java constructor cannot be abstract, static, final, and synchronized
     */

    //Default Constructor :  When there is no any constructor to create the object, compiler provides default constructor
    public BankAccount() { }

    //Parameterized Constructor : A constructor which has a specific number of parameters
    public BankAccount(double balance, String accountNum) {
        this.balance = balance;
        this.accountNum = accountNum;
    }
}

