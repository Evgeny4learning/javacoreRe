package zz.something.JavaMarathon.Day6;

public class Task6Main {

    public static void main(String[] args) {

        Car kalina = new Car();
        kalina.info();
        kalina.setYearOfProduction("1900");
        kalina.yearDifference(2100);

        Motorbike yamaha = new Motorbike("black", "ya1", "1991");
        yamaha.info();
        yamaha.yearDifference(2010);

        System.out.println();
        System.out.println("Task 6_2");

        Airplane suhoi = new Airplane("Boing", "1992", 400, 1600);
        suhoi.info();
        suhoi.fillUp(200);
        suhoi.fillUp(900);
        suhoi.setYear("2004");
        suhoi.setLenght(9000);
        suhoi.info();

        System.out.println();
        System.out.println("Task 6_3");

        Student Jojo = new Student("Jojo");
        Teacher Yoda = new Teacher("Yoda", "Power control");
        Yoda.evaluate(Jojo);

    }

}
