package zz.something.JavaMarathon.Day12.Day12_5alt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<String, Integer> members1 = new HashMap<>();
        members1.put("Joshua", 55);
        members1.put("Balbo", 121);
        MusicBand band1 = new MusicBand("JOSKIE", 2010, members1);
        band1.addMember("asd", 23);
//        System.out.println(members1);
        System.out.println(band1.getMembers());
        band1.removeMember("asd");
        System.out.println(band1.getMembers());

        Map<String, Integer> members2 = new HashMap<>();
        MusicBand band2 = new MusicBand("nonono", 2020, members2);
        band2.addMember("Genever", 12);
        band2.addMember("Clevr", 22);
        band2.addMember("Imposter", 00);
        band2.removeMember("Imposter");
        System.out.println(band2.getMembers());

        MusicBand.transferMembers(band2, band1);
        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
        System.out.println(band1);
    }
}
