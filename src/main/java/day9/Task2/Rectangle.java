package day9.Task2;

public class Rectangle extends  Figure{
    private int width;
    private  int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
