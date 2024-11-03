package zz.something.JavaMarathon.Day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Day15 {
    //info model/size/with 0 quant write in file missingshoes.txt in resources

    public static void main(String[] args) {
        File shoes = new File("something/resources/shoes.csv");
        String line;
        String[] splitLine;
        List<String> splitList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(shoes))) {
            System.out.println("модели, которых на складе 0");
            while ((line = reader.readLine()) != null) {
                splitLine = line.split(";");
                if (splitLine[2].matches("0")) {
//                    System.out.println(Arrays.toString(splitline));
                    splitList.add(line);
                }
            }
            System.out.println(splitList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileToWrite = "something/resources/shoesToOrder.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {
         //   writer.write(splitList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
