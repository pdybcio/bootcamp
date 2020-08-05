package com.company.Webinar7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Przemyslaw", "Psikuta", 30);
        Teacher teacher = new Teacher("Zbyszek", "Stonoga", 48, "magister", "polityka", 4302.22);
        Student student = new Student("Lukasz", "Szumowski", 50, "medycyna", 5);
        person.displayInformationAboutMe();
        teacher.displayInformationAboutMe();
        student.displayInformationAboutMe();
    }
}