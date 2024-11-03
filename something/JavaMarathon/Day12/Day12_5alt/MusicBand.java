package zz.something.JavaMarathon.Day12.Day12_5alt;

import java.util.*;

public class MusicBand {

    private final String name;
    private final int year;
//    private List<MusicArtist> members = new ArrayList<>(); //tut hashmap
    private Map<String, Integer> mapMembers = new HashMap<>(); // а что, если больше двух полей для мембера??

    public static void transferMembers (MusicBand from, MusicBand to) {
        to.mapMembers.putAll(from.getMembers());
        from.mapMembers.clear();
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, Map<String, Integer> mapMembers) {
        this.name = name;
        this.year = year;
        this.mapMembers = mapMembers;
    }

    public void addMember(String name, Integer age) {
        mapMembers.put(name, age);
    }

    public void setMembers(Map<String, Integer> mapMembers) {
        this.mapMembers = mapMembers;
    }

    public Map<String, Integer> getMembers() {
        return mapMembers;
    }

    public void removeMember(String member) {
        //todo переделать мемберс лист в хешмапу на уровне класса
        mapMembers.remove(member);
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + mapMembers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicBand musicBand = (MusicBand) o;
        return year == musicBand.year && Objects.equals(name, musicBand.name) && Objects.equals(mapMembers, musicBand.mapMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, mapMembers);
    }
}
