package com.pattern.strategy;

public class Person {
    private int age;
    private String name;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, String phoneNumber, int age) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
