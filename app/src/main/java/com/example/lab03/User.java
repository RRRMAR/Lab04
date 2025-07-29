package com.example.lab03;

import java.util.Date;

public class User {
    //Attribute
    String firstName;
    String lastName;
    int age;

    public User(String fullName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public User() {

    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void getSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age + " years");
    }
}
