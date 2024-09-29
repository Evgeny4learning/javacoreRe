package zz.something.JavaMarathon;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            int floorNumber;
//            System.out.println("Введите количество этажей у здания");
//            floorNumber = scanner.nextInt();
//            if (floorNumber > 0 && floorNumber <= 4) {
//                System.out.println("Малоэтажный дом");
//            } else if (floorNumber > 4 && floorNumber <= 8) {
//                System.out.println("Среднеэтажный дом");
//            } else if (floorNumber > 9) {
//                System.out.println("Многоэтажный дом");
//            } else if (floorNumber < 0) {
//                System.out.println("Ошибка ввода");
//            }
//        }

//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Input A");
//            int lowA = scanner.nextInt();
//            System.out.println("Input B");
//            int highB = scanner.nextInt();
//
//            System.out.println("with fori");
//            for (int counter = lowA + 1; counter < highB; counter++) {
//                if ((counter % 5) == 0 && (counter % 10) != 0 ) {
//                    System.out.printf(counter + " ");
//                }
//            }
//
//            System.out.println();
//            System.out.println("with while");
//            System.out.println("Input A");
//            lowA = scanner.nextInt();
//            System.out.println("Input B");
//            highB = scanner.nextInt();
//
//            lowA++;
//            while (lowA < highB) {
//                if (lowA % 5 == 0 && lowA % 10 != 0) {
//                    System.out.printf(lowA + " ");
//                }
//                lowA++;
//            }
//        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input number x = ");
            double x = scanner.nextDouble();
            double y;

            if (x >= 5) {
                y = (x * x - 10) / (x + 7);
                System.out.println("y = " + y);
            } else if (x < 5 && x > -3) {
                y = (x + 3) * (x * x - 2);
                System.out.println("y = " + y);
            } else if (x < -3) {
                y = 420;
                System.out.println("y = " + y);
            }
        }


    }
}
