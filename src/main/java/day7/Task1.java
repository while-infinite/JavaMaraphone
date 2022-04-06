package day7;



public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("China", 2018, 35, 5047);
        Airplane plane2 = new Airplane("japan", 2020, 45, 5067);
        Airplane.compareAirplanes(plane1, plane2);


    }
}