package zz.something.JavaMarathon;

import java.util.Scanner;

public class Day3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chislit;
        double znamenat;

        while(true) {
            System.out.println("Input two numbers");
            chislit = scanner.nextDouble();
            znamenat = scanner.nextDouble();

            if (znamenat == 0) {
                System.out.println("Program has been stopped");
                break;
            } else {
                System.out.println("Result of division is " + chislit / znamenat);
            }

        }
    }
}
