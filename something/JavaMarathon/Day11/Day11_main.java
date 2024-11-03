package zz.something.JavaMarathon.Day11;

public class Day11_main {
    public static void main(String[] args) {

        Warehouse house = new Warehouse();
        Picker jo = new Picker(0, house);
        Courier bo = new Courier();
        bo.setHouse(house);



        for (int i = 0; i < 1500; i++) {
            jo.doWork();
            bo.doWork();
        }
        System.out.println(house);
        System.out.println("Picker " + jo.getSalary());
        System.out.println("Courier " + bo.getSalary());

        System.out.println("second warehouse");
        Warehouse warehouse2 = new Warehouse();
        Picker jojo = new Picker(0,warehouse2);
        Courier bobo = new Courier();
        bobo.setHouse(warehouse2);

        for (int i = 0; i < 1499; i++) {
            jojo.doWork();
            bobo.doWork();
        }

        System.out.println(warehouse2);
        System.out.println("Picker " + jojo.getSalary());
        System.out.println("Courier " + bobo.getSalary());

    }
}
