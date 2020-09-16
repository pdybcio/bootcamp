package com.company.Webinar9;

import com.company.Webinar9.students.Student;
import com.company.Webinar9.students.StudentsGenerator;
import com.company.Webinar9.teachers.Teacher;
import com.company.Webinar9.teachers.TeachersGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<com.company.Webinar9.Person> persons = new ArrayList<>(10);
        List<Student> students = new StudentsGenerator().getStudents();
        List<Teacher> teachers = new TeachersGenerator().getTeachers();

        persons.addAll(students);
        persons.addAll(teachers);


        persons.forEach(person -> {
            person.displayInformationAboutMe();
            person.displayReasonForGoingToUniversity();
            person.displayInfoHowDoISpendMyHoliday();
        });

        System.out.println();
        teachers.forEach(teacher -> {
            teacher.conductScientificStudy();
            teacher.writeThesis();
            teacher.prepareExamForStudents(students);
            teacher.displayExamsList(teacher);
        });
    }
}
