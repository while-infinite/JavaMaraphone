package day9.Task2;

import java.time.Year;
import java.util.Objects;

public class TestFigures {
    public static double sumArea;
    public static double sumPerimeter;

    public static double calculateRedPerimeter (Figure[]figures){
        for (Figure fig : figures) {
            if (Objects.equals(fig.getColor(), "Red"))
                sumPerimeter += fig.perimeter();
        }
            return sumPerimeter;
    }

    public static double calculateRedArea (Figure[]figures){
        for (Figure fig : figures) {
            if (fig.getColor().equals("Red"))
                sumArea += fig.area();
        }
            return  sumArea;
    }
    public static void main(String[] args) {


        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")


        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));





    }
}
