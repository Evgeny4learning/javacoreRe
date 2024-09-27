package zz.something.ClassesHW;

public class Car1 {
public static void main(String[] args) {
        Car1 car = new Car1();
        car.setModel("Toyota");
        car.setYear(4);
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        }
        }

        class Car1 {
private String model;
private int year;

public String getModel() {
        return model;
        }

public void setModel(String model) {
        this.model = model;
        }

public int getYear() {
        return year;
        }

public void setYear(int year) {
        this.year = year;
        }
        }