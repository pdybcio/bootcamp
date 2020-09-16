package com.company.Webinar9.students;

import com.company.Webinar9.Person;

import java.util.*;

public class Student extends Person implements RelaxTime, Learning {

    private Map<String, Integer> index = new HashMap<>(5);
    private String fieldOfStudy;
    private int semester;
    private final static int MAX_AGE = 30;
    private static int i = 1;
    private int numberOfIndex;


    public Student(String firstName, String lastName, int age, String fieldOfStudy, int semester) {
        super(firstName, lastName, checkIfStudentIsNotTooOld(age));
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
        this.numberOfIndex = i++;
        createIndex();
    }

    public Map<String, Integer> getIndex() {
        return index;
    }

    private void createIndex() {
        index.put("Historia", 0);
        index.put("Wf", 0);
        index.put("Ekoludek", 0);
        index.put("Chemia", 0);
        index.put("Biologia", 0);
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
        goOutForBeerWithFriends();
        System.out.println("Moja metoda nauki to: " + getRandomLearningMethodFromList(listOfLearningMethods()));
    }

    @Override
    public void displayReasonForGoingToUniversity() {
        System.out.println("Ide na uniwersytet by sie uczyc");
    }


    @Override
    public void displayInfoHowDoISpendMyHoliday() {
        System.out.println("Jezdze na jezioro");
    }

    @Override
    public void goOutForBeerWithFriends() {
        System.out.println("Wychodze ze znajomymi na piwo. ");
    }

    @Override
    public List<String> listOfLearningMethods() {
        List<String> learningMethods = new ArrayList<>();
        learningMethods.add("Youtube");
        learningMethods.add("Ksiazki");
        learningMethods.add("Biblioteka");
        learningMethods.add("Udemy");
        learningMethods.add("Kolega uczy");

        return learningMethods;
    }

    private String getRandomLearningMethodFromList(List<String> learningMethods) {
        Random random = new Random();
        int randomNumber = random.nextInt(learningMethods.size());
        return learningMethods.get(randomNumber);
    }

    public void setIndex(Map<String, Integer> index) {
        this.index = index;
    }


    public boolean isExamPassed(String examName) {
        return this.index.get(examName) > 2;
    }

    public int getNumberOfIndex() {
        return numberOfIndex;
    }


    public String displayInformationAboutGrade(String subject){
        return "\tNumer indeksu: " + this.getNumberOfIndex()+ " " + getFirstName() + " " + getLastName() +
                ", Ocena: " + this.index.get(subject);
    }


}
