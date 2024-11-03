package zz.something.JavaMarathon.Day12.Day12_5;

import java.util.Objects;

public class MusicArtist {

    private String name;
    private int ageArtist;

    MusicArtist(String name, int ageArtist) {
        this.name = name;
        this.ageArtist = ageArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeArtist() {
        return ageArtist;
    }

    public void setAgeArtist(int ageArtist) {
        this.ageArtist = ageArtist;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", ageArtist=" + ageArtist +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicArtist that = (MusicArtist) o;
        return ageArtist == that.ageArtist && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ageArtist);
    }
}
