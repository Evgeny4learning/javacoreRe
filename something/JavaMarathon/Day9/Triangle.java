package zz.something.JavaMarathon.Day9;

public class Triangle extends Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double perim = perimeter() / 2;
        return Math.sqrt(perim * (perim - sideA) * (perim - sideB) * (perim - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
