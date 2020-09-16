package com.company.Webinar9.teachers;

import java.util.ArrayList;
import java.util.List;

public class TeachersGenerator {

    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        teachers.add(new Teacher("Zbyszek", "Stonoga", 48, "magister", "Historia", 4302.22));
        teachers.add(new Teacher("Nauczyciel", "Jakis", 48, "mgr", "Wf", 3000));
        teachers.add(new Teacher("C", "C", 26, "mgr", "Ekoludek", 4100));
        teachers.add(new Teacher("C", "C", 26, "mgr", "Chemia", 4100));
        teachers.add(new Teacher("C", "C", 26, "mgr", "Biologia", 4100));

        return teachers;
    }


}
