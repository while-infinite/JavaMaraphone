package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(1990);
        System.out.println(car.yearDifference(2008));
        Motorbike moto = new Motorbike("Suzuki", "black", 2013);
        moto.info();
        System.out.println(moto.yearDifference(2022));


    }
}
