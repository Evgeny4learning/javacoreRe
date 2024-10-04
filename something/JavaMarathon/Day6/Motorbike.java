package zz.something.JavaMarathon.Day6;

public class Motorbike {

    private static String color;
    private static String yearOfProduction;
    private static String model;

    public Motorbike(String color, String model, String yearOfProduction) {
        Motorbike.color = color;
        Motorbike.model = model;
        Motorbike.yearOfProduction = yearOfProduction;
    }

    public String getColor() {return  color;}
    public String getModel() {return  model;}
    public String getYearOfProduction() {return  yearOfProduction;}

    public String info() {
        return "Это мотоцикл";
    }

    public void yearDifference(int year) {
        System.out.println(Integer.parseInt(getYearOfProduction())  - year);
    }
}
