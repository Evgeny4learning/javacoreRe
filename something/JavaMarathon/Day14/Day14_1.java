package zz.something.JavaMarathon.Day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_1 {
    public static void main(String[] args) throws Exception {
        //exc exist & exc not 10 numb
        File file = new File("C:\\Users\\Kai\\Desktop\\jaava\\учебные материалы от Кирилла\\code\\src\\zz\\something\\JavaMarathon\\Day14\\smth.txt"); //which path are prefferable
        printSumDigits(file);

        File file2 = new File("something/JavaMarathon/Day14/brokenfile");
        printSumDigits(file2);
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int sum = 0;
            Scanner scanner = new Scanner(reader);
            ArrayList<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
//            while ((number = reader.read()) != -1) { //фигачит байты?
//              list.add(number);
//            }
            System.out.println(list);
            if (list.size() != 10) throw new Exception("not 10 numbers!");

//            int sum2 = 0;
//            for (int t : list) {
//                sum2 += t;
//            }

            sum = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("sum of 10 numbers is " + sum);
//            System.out.println("sum2 of 10 numbers is " + sum2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file");
        }

    }
}
