package com.vitiya.java.lecture1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    // Parameterized Constructor
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}

class Registry {

    public static void main(String[] args) {
        Student s1 = new Student(1000,"Viraj","Kurunegala");

    /*
    Registry can't access the studentId or other attribute directly

    s1.studentId;
    s1.studentName;
    s1.studentAddress;

    */

    /*
    To access the attribute, Registry should go thought the getter and to modify should go thought setters
    Setters :  for set the values / modify the values
    Getters : for access the existing value
    */

        s1.getStudentId();
        s1.getStudentName();
        s1.getStudentAddress();

        s1.setStudentId(2000);
        s1.setStudentName("Alex");
        s1.setStudentAddress("Colombo");

    }

}
