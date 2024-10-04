package zz.something.JavaMarathon.Day5;

public class Task5Main {
    public static void main(String[] args) {

        Car lada = new Car();
        lada.setColor("Вишневая");
        lada.setModel("Девятка");
        lada.setYearOfProduction("1999");
        System.out.println(lada.getColor() + " " + lada.getModel() + " "
                + lada.getYearOfProduction() + " года выпуска");

        System.out.println();

        Motorbike harley = new Motorbike("Purple", "Harley Davidson",
                "2002");
        System.out.printf("Цвет %s модель %s год выпуска %s%n",
                harley.getColor(), harley.getModel(), harley.getYearOfProduction());

    }
}
