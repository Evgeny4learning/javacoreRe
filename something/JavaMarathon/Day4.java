package zz.something.JavaMarathon;

import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of elements: ");
        n = scanner.nextInt();
        array = new int[n];
        System.out.println("Введено число " + n + ". Сгенерирован следующий массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random() + 1);
            //System.out.printf (array[i] + " ");
        }

        int moreThan8 = 0;
        int equal1 = 0;
        int evenElements = 0;
        int unevenElements = 0;
        int sumOfElements = 0;

        for (int element:
             array) {
            if (element > 8) {
                moreThan8++;
            }
            if (element == 1) {
                equal1++;
            }
            if (element % 2 == 0) {
                evenElements++;
            }
            if (element % 2 != 0) {
                unevenElements++;
            }
            sumOfElements = sumOfElements + element;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + evenElements);
        System.out.println("Количество нечетных чисел: " + unevenElements);
        System.out.println("Сумма всех элементов массива: " + sumOfElements);

        System.out.println();
        System.out.println("task 4.2");

        int[] array2 = new int[100];
        int maxElem = 0;
        int minElem = 1;
        int numberEleWithEndZero = 0;
        int sumEleWithEndZero = 0;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10000);
        }

        for (int ele:
             array2) {
            if (ele > maxElem) maxElem = ele;
            if (ele < minElem) minElem = ele;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("lenght " + array2.length);
        System.out.println("Max Element " + maxElem);
        System.out.println("Min Element " + minElem);
    }
}
