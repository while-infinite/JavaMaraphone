package day9.Task2;

public class Circle extends Figure {
    private double circleRadius;

    public Circle(double circleRadius, String color ) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return  (Math.PI * Math.pow(circleRadius, 2));

    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }
}
