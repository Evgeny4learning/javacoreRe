package zz.something.JavaMarathon.Day6;

public class Airplane {

    private String producer;
    private String year;
    private int lenght;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, String year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %s, длина: %d, вес: %d, " +
                " количество топлива в баке: %d", this.producer, this.year,
                this.lenght, this.weight, this.getFuel());
        System.out.println();
    }

    public int fillUp(int fuel) {
        return this.fuel = fuel + this.fuel;


    }


}
