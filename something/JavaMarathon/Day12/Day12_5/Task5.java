package zz.something.JavaMarathon.Day12.Day12_5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

//        MusicBand band1 = new MusicBand("group1", 2090,
//                Arrays.asList(new MusicArtist("Peper", 18),
//                        new MusicArtist("Bongo", 22)));

        MusicBand band1 = new MusicBand("group1", 2010, new ArrayList<>());
        band1.addMember(new MusicArtist("Pepe", 12));
        band1.addMember(new MusicArtist("Bongo", 22));


        List<MusicArtist> artistList2 = new ArrayList<>();
        artistList2.add(new MusicArtist("Oleg", 66));
        artistList2.add(new MusicArtist("Pasha", 32));
        MusicBand band2 = new MusicBand("group2", 1990, artistList2);

//        band1.addMember(new MusicArtist("Zuzaz", 22)); не сработает тк добавлял как Arrays.asList как в том файле
        band2.addMember(new MusicArtist("Zuzaz", 22));
        band2.addMember(new MusicArtist("Salt", 82));

        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
        System.out.println("tut remove");

        band2.removeMember(new MusicArtist("Zuzaz", 22)); //так не сработает, надо как-то перейти к member-name
//      не будет находить(и соответственно удалять) мембер, пока не переопределишь equals hascode
        System.out.println(band2.getMembers());
        System.out.println("after remove");

//        MusicBand.transferMembers(band1, band2);
        MusicBandHelpers.transferMembers2(band1, band2);
        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
    }
}
