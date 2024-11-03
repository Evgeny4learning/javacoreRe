package zz.something.JavaMarathon.Day12.Day12_5;


public class MusicBandHelpers {

    public static void transferMembers2 (MusicBand from, MusicBand to) {
//        to.members.addAll(from.members); // только тк статический определен в этом же классе
//        from.members.clear(); // из первого и из второго
//        to.setMembers(to.getMembers().addAll(from.getMembers())); //из другого класса
        to.getMembers().addAll(from.getMembers());
        from.setMembers(null);
    }
}
