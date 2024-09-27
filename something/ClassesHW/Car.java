package zz.something.ClassesHW;

public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private double price;

    public void setEngine(String type, int horsepower) {
        Engine engine = new Engine(type, horsepower);
        this.engine = engine;
    }

    public void getEngine() {
        engine.getEngineInfo();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static class Engine {
        private String type;
        private int horsepower;

        Engine(String type, int horsepower) {
            this.type = type;
            this.horsepower = horsepower;
        }

        private void getEngineInfo() {
            System.out.println("Engine type is " + type + "; horsepower is " + horsepower);
        }

    }
}
