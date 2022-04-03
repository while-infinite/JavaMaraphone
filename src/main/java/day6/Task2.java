package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("China", 2018, 35, 5047);
        plane.info();
        plane.setLength(44);
        plane.setYear(2020);
        plane.fillUp(3490);
        plane.fillUp(4000);
        plane.info();



    }
}
