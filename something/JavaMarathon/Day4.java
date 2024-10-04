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
        int minElem = 0;
        int numberEleWithEndZero = 0;
        int sumEleWithEndZero = 0;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10000);
        }

        minElem = array2[0];
        for (int ele:
                array2) {
            if (ele > maxElem) maxElem = ele;
            if (ele < minElem) minElem = ele;
            if (ele % 10 == 0) {
                numberEleWithEndZero++;
                sumEleWithEndZero = sumEleWithEndZero + ele;
            }
        }

        System.out.println(Arrays.toString(array2));
        System.out.println("lenght: " + array2.length);
        System.out.println("Max ele: " + maxElem);
        System.out.println("Min ele: " + minElem);
        System.out.println("Number of element with zero end: " + numberEleWithEndZero);
        System.out.println("Sum of element with zero end: " + sumEleWithEndZero);

        System.out.println();
        System.out.println("task 4_3");

        int k = 12;
        int l = 8;
        int[][] array3 = new int[k][l];
        int[][] array4test = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        // насколько важно объявлять переменные сверху или лучше
        // рядом с местом, где будет использоваться
        //int[] sumOfRow = new int[array3.length];
        int sumOfRow = 0;
        int maxSumOfRow = 0;
        int indexOfsumOfRow = 0;
        int indx = 0;

        for (k = 0; k < array3.length; k++) {
            for (l = 0; l < array3[k].length; l++) {
                array3[k][l] = (int) (Math.random() * 50);
            }
        }

//        for (int[] row : array3) {
//            for (int ele : row) {
//                sumOfRow = sumOfRow + ele;
//                System.out.printf("%4d", ele);
//            }
//            System.out.print("  -  sum " + sumOfRow + " indx " + indx++);
//            if (sumOfRow >= maxSumOfRow) {
//                indexOfsumOfRow =  row;
//                maxSumOfRow = sumOfRow;
//            }
//
//            sumOfRow = 0;
//            System.out.println();
//        }

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sumOfRow = sumOfRow + array3[i][j];
                System.out.printf("%4d", array3[i][j]);
            }
            if (sumOfRow >= maxSumOfRow) {
                maxSumOfRow = sumOfRow;
                indexOfsumOfRow = i;
            }

            System.out.print("  -  sum " + sumOfRow + " indx " + indx++);
            sumOfRow = 0;
            System.out.println();
        }
        System.out.println("index of row with max sum of elements: " + indexOfsumOfRow);
//        System.out.println(Arrays.deepToString(array3));

        System.out.println();
        System.out.println("task 4_4");

        int m = 100;
        int[] array5 = new int[m];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random() * 10000);
        }

        System.out.println(Arrays.toString(array5));

        int summ3closest;
        int maxSum3Clos = 0;
        int indexMax3 = 0;
        for (int i = 1; i < array5.length-1; i++) {
            summ3closest = array5[i-1] + array5[i] + array5[i+1];
            if (summ3closest >= maxSum3Clos) {
                maxSum3Clos = summ3closest;
                indexMax3 = i-1;
            }
//            System.out.println("max " + maxSum3Clos + "     sumclos " + summ3closest );
        }
        System.out.println();
        System.out.println("Max sum - " + maxSum3Clos);
        System.out.println("Index of first if max 3 numbers - " + indexMax3);
    }

}

