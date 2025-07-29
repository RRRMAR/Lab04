package com.example.lab03;

public class Student extends User {
    private String studentId;
    private String major;

    public Student(String firstName, String lastName, int age, String studentId, String major) {
        super(firstName, lastName , age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void getSummary() {
        System.out.println("Student: " + getfirstName());
        System.out.println("Student: " + getlastName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}
