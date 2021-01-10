package com.vitiya.java.lecture1;

// Class
public class Management {

    public static void main(String[] args) {

        Employee e1 = new Employee("1", "Viraj");
        Manager e2 = new Manager("2", "Alex", 1000, "Billing");
        Mechanic e3 = new Mechanic("3", "Lee", "Hybrid", "Diploma");

    }
}

// Parent Class
class Employee {
    private String empId;
    private String empName;

    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}

//Sub Class extends from Parent Class
class Manager extends Employee{
    private int manageDeptId;
    private String manageDeptName;

    public Manager(String empId, String empName, int manageDeptId, String manageDeptName) {
        super(empId,empName);
        this.manageDeptId = manageDeptId;
        this.manageDeptName = manageDeptName;
    }

    public int getManageDeptId() {
        return manageDeptId;
    }

    public void setManageDeptId(int manageDeptId) {
        this.manageDeptId = manageDeptId;
    }

    public String getManageDeptName() {
        return manageDeptName;
    }

    public void setManageDeptName(String manageDeptName) {
        this.manageDeptName = manageDeptName;
    }
}

//Sub Class extends from Parent Class
class Mechanic extends Employee{
    private String expertiseField;
    private String higherQulification;

    public Mechanic(String empId, String empName, String expertiseField, String higherQulification) {
        super(empId, empName);
        this.expertiseField = expertiseField;
        this.higherQulification = higherQulification;
    }

    public String getExpertiseField() {
        return expertiseField;
    }

    public void setExpertiseField(String expertiseField) {
        this.expertiseField = expertiseField;
    }

    public String getHigherQulification() {
        return higherQulification;
    }

    public void setHigherQulification(String higherQulification) {
        this.higherQulification = higherQulification;
    }
}
