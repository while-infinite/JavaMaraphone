package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNum = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && i <=30)
                evenNum.add(i);
            if(i % 2 == 0 && i >= 300)
                evenNum.add(i);

        }
        for (Integer i : evenNum) {
            System.out.println(i);
        }

    }
}
