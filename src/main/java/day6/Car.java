package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println(model);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println(color);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getYear() {
        System.out.println(year);
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int diff = year - inputYear;
        return Math.abs(diff);

    }


}
