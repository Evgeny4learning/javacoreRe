package zz.something.JavaMarathon.Day12.Day12_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MusicBand {

    private final String name;
    private final int year;
    private List<String> members = new ArrayList<>(); //tut hashmap

    public static void transferMembers (MusicBand from, MusicBand to) {
        to.members.addAll(from.members); // только тк статический определен в этом же классе
        from.members.clear(); // из первого и из второго
//        to.setMembers(to.getMembers().addAll(from.getMembers()); из другого класса
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void removeMember(String member) {
        //todo переделать мемберс лист в хешмапу на уровне класса
//        members = members.stream()
//                .filter(name -> !Objects.equals(name, member))
//                .toList();
//        members.removeIf(name -> !Objects.equals(name, member));
        members.remove(member);
    }

    public int getYear() {
        return year;
    }



    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicBand musicBand = (MusicBand) o;
        return year == musicBand.year && Objects.equals(name, musicBand.name) && Objects.equals(members, musicBand.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, members);
    }
}
