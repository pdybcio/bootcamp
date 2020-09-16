package com.company.Webinar4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int arrayLength;
    static int[] arrayOfNumbers;

    public static void main(String[] args) {
        System.out.println("Podaj liczbe elementow tablicy i wcisnij enter: ");
        arrayLength = scanner.nextInt();
        arrayOfNumbers = new int[arrayLength];
        System.out.println("Chcesz podać liczby sam czy mam je wylosowac?");
        System.out.println("1 oznacza, że chcesz sam podać a 2, że sam wylosuje z zadanego zakresu. Nastepnie wcisnij enter");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Po kazdej liczbie wcisnij enter: ");
                enterNumbers();
                System.out.println(Arrays.toString(arrayOfNumbers));
                break;
            case 2:
                System.out.println("Podaj poczatek zakresu cyfr i wcisnij enter");
                int minRange = scanner.nextInt();
                System.out.println("Podaj koniec zakresu cyfr i wcisnij enter");
                int maxRange = scanner.nextInt();
                randomNumbersWithinSpecificRange(minRange, maxRange);
                break;
            default:
                System.out.println("Podaj liczbe 1 lub 2 i wcisnij enter");
        }
        System.out.print("Numery parzyste to : \n");
        showEvenNumbers();
    }

    private static void enterNumbers() {
        for (int i = 0; i < arrayLength; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(arrayOfNumbers));
    }

    private static void randomNumbersWithinSpecificRange(int x, int y) {
        while (true) {
            if (x >= y) {
                System.out.println("nie klamczuszkuj mi tutaj ;) Podaj poprawne dane, ale to już!!");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } else {
                System.out.println("Podales poprawne dane wejsciowe");
                Random random = new Random();
                for (int i = 0; i < arrayLength; i++) {
                    arrayOfNumbers[i] = random.nextInt((y - x) + 1) + x; //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
                }
                System.out.println(Arrays.toString(arrayOfNumbers));
                break;
            }
        }
    }

    private static void showEvenNumbers() {
        for (int i = 0; i < arrayLength; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                System.out.print("wartość indeksu [" + i + "] wynosi " + arrayOfNumbers[i] + "\n");
            }
        }
    }
}