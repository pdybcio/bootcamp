package com.company.Webinar8;

public class Student extends Person {
    private String fieldOfStudy;
    private int semester;
    final static int age = 30;
    public Student(String firstName, String lastName, String fieldOfStudy, int semester) {
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
    @Override
    public void displayReasonForGoingToUniversity() {
        System.out.println("\nIde na uniwersytet by sie uczyc");
    }
    @Override
    public void displayInfoHowDoISpendMyHoliday() {
        System.out.println("Jezdze na jezioro");
    }
}