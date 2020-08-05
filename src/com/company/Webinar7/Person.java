package com.company.Webinar7;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInformationAboutMe() {
        System.out.printf("\nCzesc! Nazywam sie %s %s i mam %d lat. ", this.firstName, this.lastName, this.age);
    }
}
