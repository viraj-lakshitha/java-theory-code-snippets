package com.vitiya.java.lecture1;

/**
 * Main Four types of OOP Concepts
 * --> Abstraction
 * --> Polymorphism
 * --> Inheritance
 * --> Encapsulation
 * */

/**
 * Abstraction ( Example {@link Phone} )
 * - When class without abstract keyword, that class should include all the methods in implemented interface as {@link PhoneWithBasicOperations}
 * - But When the class with abstract keyword, that class should not have to implemente aall the methods, it can be customized as {@link PhoneWithAllOperations}
 * */

/**
 * Encapsulation ( Example {@link Student} )
 * - By providing only getters and setters method, you can make class read-only OR write-only
 * - Its a way to archive data hiding in Java, because other classes will not able to access the data thought private data members
 **/


/**
 * How to create Object ?
 * eg : Student s1 = new Student(1000,"Viraj","Kurunegala"); ( {@link Student} )
 * Student / Student() :  Student Class Reference
 * s1 : Object Reference
 * (1000,"Viraj","Kurunegala") : Argument : Order should be follows as the constructor in Super Class
 * */

/**
 * How to calling instance method? ( {@link Student} )
 * eg :  s1.getStudent() or s1.setStudentName("Alex")
 * s1 : Object Name
 * getStudent / setStudentName : Method Name
 * () : empty argument
 * ("Alex") : String Argument
 * */

public class OOPConcepts {

}
