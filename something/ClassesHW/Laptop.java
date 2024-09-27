package zz.something.ClassesHW;

import javax.crypto.spec.PSource;

public class Laptop {
    private String brand;
    private String model;
    private Processor processor;
    private int price;

    public void setProcessor(String name, String speed) {
        Processor processor = new Processor(name, speed);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor.getProcessorInfo();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public class Processor {
        private String name;
        private String speed;

        Processor(String name, String speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getProcessorInfo() {
            return String.valueOf(new StringBuilder(": ").append(name)
                    .append(" with speed ").append(speed));
        }

    }

}
