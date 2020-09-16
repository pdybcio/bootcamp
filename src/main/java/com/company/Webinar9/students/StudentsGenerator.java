package com.company.Webinar9.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StudentsGenerator {


    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        createStudent("A", "A", 20, "chemia", 4);
        createStudent("B", "B", 20, "chemia", 3);
        createStudent("C", "C", 20, "chemia", 5);
        createStudent("D", "D", 20, "chemia", 6);

        return students;
    }


    private void createStudent(String firstName, String lastName, int age, String fieldOfStudy, int semester) {

        try {
            Student student = new Student(firstName, lastName, age, fieldOfStudy, semester);
            student.setIndex(setRandomGradeToIndex(student.getIndex()));
            this.students.add(student);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    private Map<String, Integer> setRandomGradeToIndex(Map<String, Integer> index) {
        index.replaceAll((k,v) -> v = randomGrade());
        return index;
    }

    private Integer randomGrade() {
        Random random = new Random();
        return random.nextInt((5-1) + 1) + 1;
    }


}
