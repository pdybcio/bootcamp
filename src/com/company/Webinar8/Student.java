package com.company.Webinar8;

public class Student extends Person {
    private String fieldOfStudy;
    private int semester;
    private final static int MAX_AGE = 30;

    public Student(String firstName, String lastName, int age, String fieldOfStudy, int semester) {
        super(firstName, lastName, checkIfStudentIsNotTooOld(age));
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
    }

    private static int checkIfStudentIsNotTooOld(int age) {
        if (MAX_AGE < age) {
            throw new ArithmeticException("Jesteś za stary na studenta!");
        } else return age;
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