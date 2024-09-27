package zz.something.ClassesHW;

import java.util.Arrays;

public class WatchMain {
    public static void main(String[] args) {
        Watch watch1 = new Watch();
        watch1.setBrand("Uglich watch factory");
        watch1.setModel("Cosmos1984");
        watch1.setMaterial("Bronze");
        watch1.setPrice(1500.500);

        System.out.println("Brand " + watch1.getBrand());
        System.out.println("Model " + watch1.getModel());
        System.out.println("Material " + watch1.getMaterial());
        System.out.println("Price " + watch1.getPrice());
        System.out.println();

        Car car1 = new Car();
        car1.setEngine("supapower", 9000);
        car1.setBrand("Lada");
        car1.setModel("Priora");
        car1.setPrice(15000);

        System.out.println("Car is " + car1.getModel() + " from " + car1.getBrand()
                + " brand with price " + car1.getPrice() + "$");
        car1.getEngine();
        System.out.println("");

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Neptun");
        laptop1.setModel("npt00037");
        laptop1.setPrice(300);
        laptop1.setProcessor("DedMicron", "3.3 GHz");

        System.out.println(new StringBuilder("Your new laptop is ")
                .append(laptop1.getBrand()).append("'s ").append(laptop1.getModel())
                .append(" with processor").append(laptop1.getProcessor())
                .append(". Total price ").append(laptop1.getPrice()).append("$"));
    }
}
