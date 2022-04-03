package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public void getModel() {
        System.out.println(model);
    }

    public void getColor() {
        System.out.println(color);
    }

    public void getYear() {
        System.out.println(year);
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int diff = year - inputYear;
        if (diff < 0) {
            return Math.abs(diff);
        } else return diff;
    }
}
