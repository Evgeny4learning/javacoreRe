package zz.something.JavaMarathon.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day12_1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Auto1");
        list.add("Auto2");
        list.add("Auto3");
        list.add("Auto4");
        list.add("Auto5");

        list.add(2, "Auto2,5");
        System.out.println("add elem in the middle " + Arrays.toString(list.toArray()));
        list.remove(0);
        System.out.println("remove first " + Arrays.toString(list.toArray()));

        System.out.println("with stream");
        List<String> carsList = new ArrayList<>();
        carsList.add("Car1");
        carsList.add("Car2");
        carsList.add("Car3");
        carsList.add("Car4");
        carsList.add("Car5");

        List<String> newList = IntStream.range(0, carsList.size())
                .mapToObj(i -> i == 2 ? "Car2.5" : carsList.get(i))
                .toList();

        List<String> finalList = newList.stream()
                .skip(1)
                .toList();
//      or
//      lambda.removeIf(item -> lambda.indexOf(item) == 0);
        System.out.println(finalList);
    }
}
