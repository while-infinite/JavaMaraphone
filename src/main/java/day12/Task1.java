package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("BMW");
        car.add("Toyota");
        car.add("Honda");
        car.add("Nissan");

        for(String list : car)
            System.out.println(list);
        System.out.println('\n');

        car.add(2,"Kia");
        for(String list : car)
            System.out.println(list);
        System.out.println('\n');

        car.remove(0);
        for(String list : car)
            System.out.println(list);

    }
}
