package com.company.Webinar9.teachers;

import com.company.Webinar9.Person;
import com.company.Webinar9.students.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends Person implements Exam, Thesis {

    private String academicDegree;
    private String specialization;
    private double salary;
    private Set<Student> examStudentsHashSet = new HashSet<>();;

    public Teacher(String firstName, String lastName, int age, String academicDegree, String specialization, double salary) {
        super(firstName, lastName, age);
        this.academicDegree = academicDegree;
        this.specialization = specialization;
        this.salary = salary;
    }

    private double calculateAnnualBonus() {
        return this.salary *12*0.1;
    }

    @Override
    public void displayInformationAboutMe() {
        super.displayInformationAboutMe();
        System.out.printf("Moja specjalizacja naukowa to %s oraz moj stopien naukowy to %s. Moja pensja miesieczna wynosi %.2f zl. Moja premia roczna wynosi: %.2f zl.",this.specialization, this.academicDegree, this.salary, calculateAnnualBonus());
    }

    @Override
    public void displayReasonForGoingToUniversity() {
        System.out.println("\nChodze na uniwersytet bo wykladam medycyne");
    }

    @Override
    public void displayInfoHowDoISpendMyHoliday() {
        System.out.println("Jezdze nad morze polskie");
    }

    @Override
    public void prepareExamForStudents(List<Student> student) {
        Set<Student> notPassedStudents = new LinkedHashSet<>();
        student.forEach(s -> {
            if (!s.isExamPassed(this.specialization)){
                notPassedStudents.add(s);
            }
        });
        this.examStudentsHashSet = notPassedStudents;

    }

    public void displayExamsList(Teacher teacher) {
        if (!teacher.getExamStudentsHashSet().isEmpty()){
            System.out.println(teacher.getSpecialization() + " lista: ");
            for (Student student : teacher.getExamStudentsHashSet()) {
                System.out.println(student.displayInformationAboutGrade(teacher.getSpecialization()));
            }
            System.out.println();
        }else {
            System.out.printf("Wszyscy studenci zdali z %s \n\n", teacher.getSpecialization());
        }
    }

    public Set<Student> getExamStudentsHashSet() {
        return this.examStudentsHashSet;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void conductScientificStudy() {
        System.out.println("Wykonuje badanie");
    }

    @Override
    public void writeThesis() {
        System.out.println("Pisze prace naukowa");
    }


}
