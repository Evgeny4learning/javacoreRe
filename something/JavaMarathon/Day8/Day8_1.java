package zz.something.JavaMarathon.Day8;

import java.time.Duration;
import java.time.Instant;

public class Day8_1 {

    public static void main(String[] args) {
        String megaString = "0 ";
        StringBuilder megaStringAlt = new StringBuilder();

        Instant startTime = Instant.now();
        for (int i = 1; i <= 20000; i++) {
            megaString += i; // !!
        }
        //       System.out.println(megaString);
        Instant endTime = Instant.now();

        System.out.println();

        Instant startTimeAlt = Instant.now();
        for (int i = 0; i <= 20000; i++) {
            megaStringAlt.append(i + " ");
        }
//        System.out.println(megaStringAlt);
        Instant endTimeAlt = Instant.now();

        System.out.println("concate: " + Duration.between(startTime, endTime));
        System.out.println("Stringbuilder: " + Duration.between(startTimeAlt, endTimeAlt));


    }

}
