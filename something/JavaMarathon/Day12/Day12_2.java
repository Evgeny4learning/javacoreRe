package zz.something.JavaMarathon.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day12_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) numbers.add(i);
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) numbers.add(i);
        }
        System.out.println(Arrays.toString(numbers.toArray()));

        System.out.println();
        System.out.println("second try");

        //как концептуально лучше?

        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0) {
                if (i <= 30 || i >= 300) numbers2.add(i);
            }
        }
        System.out.println(Arrays.toString(numbers2.toArray()));

        System.out.println("with stream");
        IntStream.rangeClosed(0, 350)
                .filter(i -> (i % 2 == 0) && (i <= 30 || i >= 300))
                .forEach(System.out::println);
    }
}
