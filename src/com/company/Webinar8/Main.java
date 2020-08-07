package com.company.Webinar8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(10);
        /*
        Teacher teacher0 = new Teacher("Zbyszek", "Stonoga", 48, "magister", "polityka", 4302.22);
        Student student0 = new Student("Lukasz", "Szumowski", "medycyna", 5);
        Teacher teacher1 = new Teacher("A", "A", 1,"mgr", "A", 4000);
        Student student1 = new Student("B", "B", "b", 4);
        Teacher teacher2 = new Teacher("C", "C", 2,"mgr", "C", 4100);
        Student student2 = new Student("D", "D", "D", 7);
        Student student3 = new Student("E", "E", "E", 7);
        Student student4 = new Student("F", "F", "F", 7);
        Student student5 = new Student("G", "G", "G", 7);
        Student student6 = new Student("H", "H", "H", 7);
         */
        Teacher teacher0, teacher1, teacher2;
        Student student0, student1, student2, student3, student4, student5, student6, s;
        persons.add(teacher0 = new Teacher("Zbyszek", "Stonoga", 48, "magister", "polityka", 4302.22));
        persons.add(student0 = new Student("Lukasz", "Szumowski", "chemia", 5));
        persons.add(student1 = new Student("B", "B", "chemia", 4));
        persons.add(teacher2 = new Teacher("C", "C", 2, "mgr", "C", 4100));
        persons.add(student2 = new Student("D", "D", "chemia", 4));
        persons.add(student3 = new Student("E", "E", "chemia", 5));
        persons.add(student4 = new Student("F", "F", "chemia", 8));
        persons.add(student5 = new Student("G", "G", "chemia", 8));
        persons.add(student6 = new Student("H", "H", "chemia", 5));
        persons.forEach(person -> {
            person.displayInformationAboutMe();
            person.displayReasonForGoingToUniversity();
            person.displayInfoHowDoISpendMyHoliday();
        });
    }
}
