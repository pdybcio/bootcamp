package com.company.Webinar7;

public class Student extends Person {

    private String fieldOfStudy;
    private int semester;

    public Student(String firstName, String lastName, int age, String fieldOfStudy, int semester) {
        super(firstName, lastName, age);
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
    }

    private int calculateYearOfSemester() {
        return (int) Math.ceil((double) semester / 2);
    }

    @Override
    public void displayInformationAboutMe() {
        super.displayInformationAboutMe();
        System.out.printf("Moim kierunkiem studiow jest %s i aktualnie jestem na %d semestrze, czyli %d roku", this.fieldOfStudy, this.semester, calculateYearOfSemester());
    }
}
