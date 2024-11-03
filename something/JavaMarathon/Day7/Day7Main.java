package zz.something.JavaMarathon.Day7;

import java.util.Arrays;

public class Day7Main {
    public static void main(String[] args) {

        Airplane airbus = new Airplane("airbus007", "2001", 1400, 665);
        Airplane suhoi = new Airplane("suhoijet", "2000", 1900, 800);

        Airplane.compareAirplanes(airbus, suhoi);

    }
}
