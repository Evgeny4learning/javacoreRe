package zz.something.JavaMarathon.Day9;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
          new Triangle("Red", 10, 10, 10),
          new Triangle("Green", 10, 20, 30),
          new Triangle("Red", 10, 20, 15),
          new Rectangle("Red", 5, 10),
          new Rectangle("Orange", 40, 15),
          new Circle("Red",4),
          new Circle("Red",10),
          new Circle("Blue",5),
        };

        System.out.println(calculateRedSquare(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) sumPerimeter = figure.perimeter() + sumPerimeter;
        }
        return sumPerimeter;
    }

    public static double calculateRedSquare(Figure[] figures) {
        double sumSquare = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) sumSquare = figure.area() + sumSquare;
        }
        return sumSquare;

    }

}
