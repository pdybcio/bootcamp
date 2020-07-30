package com.company.Webinar5;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("0")) {
            System.out.println(
                    "Wpisz 0 by zakonczyc dzialanie programu\n" +
                            "Wpisz 1 by zobaczyc aktualny kurs euro \n" +
                            "Wpisz 2 by zobaczyc aktualna pogode w Wroclawiu\n" +
                            "By zakończyć program wpisz \"0\"\n" +
                            "Po wpisaniu cyfry wcisnij klawisz enter");
            answer = scanner.nextLine();
            switch(answer) {
                case "0":
                    System.out.println("Koncze dzialanie programu");
                    break;
                case "1":
                    System.out.println("Kantor euro- wartość: 4,5 zl\n");
                    break;
                case "2":
                    System.out.println("Dzisiaj jest piekna i sloneczna pogoda\n");
                    break;
                default:
                    System.out.println("Podales niepoprawna cyfre");
            }
        }
        scanner.close();
    }
}
