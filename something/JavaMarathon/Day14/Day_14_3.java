package zz.something.JavaMarathon.Day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day_14_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("something/JavaMarathon/Day14/people");
        parseFileToPersonList(file);

        File file2 = new File("something/JavaMarathon/Day14/peopleImp.txt");
        parseFileToPersonList(file2);
    }

    public static List<Person> parseFileToPersonList(File file) throws IOException {
        List<Person> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String str;
            String[] parts;
            while((str = reader.readLine()) != null) {
                //разделить имя и возраст
                Person person = new Person(); // так ок или таки через обычный конструктор?
                parts = str.split("\s");
                for (String part: parts) {
                    if (part.matches("\\d+")) person.setAge(Integer.parseInt(part));
                    if (part.matches("\\D+")) person.setName(part);
                }
                list.add(person);
                if (person.getAge() <= 0) throw new Exception("Неккоректный файл");
            }
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
