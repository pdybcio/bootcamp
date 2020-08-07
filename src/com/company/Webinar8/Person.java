package com.company.Webinar8;

public abstract class Person {
    public String firstName;
    public String lastName;
    public int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public abstract void displayReasonForGoingToUniversity();
    public abstract void displayInfoHowDoISpendMyHoliday();
    public void displayInformationAboutMe() {
        System.out.printf("\nCzesc! Nazywam sie %s %s i mam %d lat. ", this.firstName, this.lastName, this.age);
    }
}