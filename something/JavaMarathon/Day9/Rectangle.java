package zz.something.JavaMarathon.Day9;

public class Rectangle extends Figure {

    private final double width;
    private final double length;

    Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.width = sideA;
        this.length = sideB;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
