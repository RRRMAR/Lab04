package com.example.lab03;

public class Teacher extends User {
    private String subject;

    public Teacher(String fullName, String gender, int age, String subject) {
        super(fullName, gender, age);
        this.subject = subject;
    }

    @Override
    public void getSummary() {
        System.out.println("Teacher: " + getfirstName());
        System.out.println("Teacher: " + getlastName());
        System.out.println("Teaches: " + subject);
    }
}
