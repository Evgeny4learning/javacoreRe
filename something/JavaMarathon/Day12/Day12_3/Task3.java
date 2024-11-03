package zz.something.JavaMarathon.Day12.Day12_3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            bands.add(new MusicBand("band" + i,1990 + i));
        }
        bands.forEach(System.out::println);
        Collections.shuffle(bands);
        System.out.println();
        System.out.println(groupsAfter2000(bands));

        List<MusicBand> bands1 = bands.stream()
                .filter(band -> band.getYear() > 2000)
//                .collect(Collectors.toList())
                .toList();

        bands1.forEach(System.out::println);
    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> list) {
        List<MusicBand> bands2000 = new ArrayList<>();
        for (MusicBand band : list) {
            if (band.getYear() > 2000) bands2000.add(band);
        }
        return bands2000;
    }

}
