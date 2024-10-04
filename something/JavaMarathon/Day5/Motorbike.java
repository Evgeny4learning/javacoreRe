package zz.something.JavaMarathon.Day5;

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

}
