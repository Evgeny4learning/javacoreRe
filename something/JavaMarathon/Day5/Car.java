package zz.something.JavaMarathon.Day5;

public class Car {

    private static String yearOfProduction;
    private static String color;
    private static String model;

    public void setYearOfProduction(String year) {
        Car.yearOfProduction = year;
    }
    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setColor(String color) {
        Car.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    public String getModel() {
        return model;
    }
}

