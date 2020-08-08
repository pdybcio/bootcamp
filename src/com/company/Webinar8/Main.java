package com.company.Webinar8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(10);

        persons.add(new Teacher("Zbyszek", "Stonoga", 48, "magister", "polityka", 4302.22));
        persons.add(new Student("Lukasz", "Szumowski", 30, "chemia", 5));
        persons.add(new Teacher("Nauczyciel", "Jakis", 48, "mgr", "filologia angielska", 3000));
        persons.add(new Student("B", "B", 29, "chemia", 4));
        persons.add(new Teacher("C", "C", 26, "mgr", "C", 4100));
        persons.add(new Student("D", "D", 31, "chemia", 4));
        persons.add(new Student("E", "E", 32, "chemia", 5));
        persons.add(new Student("F", "F", 19, "chemia", 8));
        persons.add(new Student("G", "G", 24, "chemia", 8));
        persons.add(new Student("H", "H", 31, "chemia", 5));

        persons.forEach(person -> {
            person.displayInformationAboutMe();
            person.displayReasonForGoingToUniversity();
            person.displayInfoHowDoISpendMyHoliday();
        });
    }
}
