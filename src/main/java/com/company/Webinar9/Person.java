package com.company.Webinar9;

public abstract class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public abstract void displayReasonForGoingToUniversity();

    public abstract void displayInfoHowDoISpendMyHoliday();

    public void displayInformationAboutMe() {
        System.out.printf("\nCzesc! Nazywam sie %s %s i mam %d lat. ", this.firstName, this.lastName, this.age);
    }

}
