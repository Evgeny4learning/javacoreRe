package zz.something.JavaMarathon.Day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Day14_2 {
    public static void main(String[] args) throws FileNotFoundException {
        String peps = "something/JavaMarathon/Day14/people";
        String badpeps = "something/JavaMarathon/Day14/peopleImp.txt";
        File people = new File(peps);
        File peoplewrong = new File(badpeps);
        parseFileToStringList(people);
        parseFileToStringList(peoplewrong);
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
//           Scanner scanner = new Scanner(reader);
           String person;
           while ((person = reader.readLine()) != null) {
                list.add(person);
                if (person.contains("-")) throw new Exception("Неккоректный входной файл");
           }
           System.out.println(list);
           return list;
       } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
       } catch (Exception e) { //tak norm voobwe?
            e.printStackTrace();
        }
        return list;
    }
}
