package com.company.Webinar7;

public class Teacher extends Person {
    private String academicDegree;
    private String specialization;
    private double salary;

    public Teacher(String firstName, String lastName, int age, String academicDegree, String specialization, double salary) {
        super(firstName, lastName, age);
        this.academicDegree = academicDegree;
        this.specialization = specialization;
        this.salary = salary;
    }

    private double calculateAnnualBonus() {
        return this.salary * 12 * 0.1;
    }

    @Override
    public void displayInformationAboutMe() {
        super.displayInformationAboutMe();
        System.out.printf("Moja specjalizacja naukowa to %s oraz moj stopien naukowy to %s. Moja pensja miesieczna wynosi %.2f zl. Moja premia roczna wynosi: %.2f zl.", this.specialization, this.academicDegree, this.salary, calculateAnnualBonus());
    }
}
