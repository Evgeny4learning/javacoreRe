package zz.something.JavaMarathon;

import java.util.Scanner;

public class Day3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chislit;
        double znamenat;

        for (int i = 0; i < 5; i++) {
            System.out.println("Input two numbers");
            chislit = scanner.nextDouble();
            znamenat = scanner.nextDouble();

            if (znamenat == 0) {
                System.out.println("Division by 0");
                System.out.println();
                i--;
                continue;
            }

            System.out.println("Result of division is " + chislit / znamenat);
            System.out.println((i + 1) + " iteration");
            System.out.println();
        }


    }
}
