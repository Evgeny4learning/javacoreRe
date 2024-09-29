package zz.something.JavaMarathon;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int counter = 0;
        while (counter < 10) {
            System.out.printf("JAVA ");
            counter++;
        }

        System.out.println();
        System.out.println("Java with fori");

        for (int i = 0; i < 10; i++) {
//            System.out.printf("JAVA " + i + " ");
            System.out.printf("JAVA ");
        }

        System.out.println();
        System.out.println("Java column while");
        counter = 0;
        while (counter < 10) {
            System.out.println("JAVA");
            counter++;
        }

        System.out.println();
        System.out.println("Java column while");
        year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + "года");
            year = year + 4;
        }

        System.out.println();
        System.out.println("Java column fori");
        for (year = 1980; year <= 2020; year = year + 4) {
            System.out.println("Олимпиада " + year + "года");
        }

        counter = 1;
        System.out.println("Input number");
        int k = scanner.nextInt();
        if (k > 0 && k < 10) {
            while (counter <= 9) {
                System.out.println(counter + " x " + k + " = " + (counter * k));
                counter++;
            }
        }
    }


}
