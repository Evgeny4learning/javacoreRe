package zz.something.JavaMarathon.Day7;

public class Airplane {

    private final String name;
    private String year;
    private int lenght;
    private final int weight;
    private int fuel = 0;

    public Airplane(String producer, String year, int length, int weight) {
        this.name = producer;
        this.year = year;
        this.lenght = length;
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
//        return ("Название: %s, год выпуска: %s, длина: %d, вес: %d, " +
//                        " количество топлива в баке: %d" + this.name this.year,
//                this.lenght, this.weight, this.getFuel();
    }

    public int fillUp(int fuel) {
        return this.fuel = fuel + this.fuel;
    }

    // как вывести имя экземпляра без поля и конструктора
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        //Todo рефактиринг  фаулер книга - условные
        if (airplane2.lenght == airplane1.lenght) {
            System.out.println("length are equal");
            return;
        }
        if (airplane1.lenght > airplane2.lenght) {
            System.out.println(airplane1.name + " longer");
            return;
        }
        System.out.println(airplane2.name + "longer");
    }

}
