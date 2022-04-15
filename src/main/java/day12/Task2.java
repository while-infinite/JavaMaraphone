package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<Integer> sortNum(int num1, int num2, List<Integer> list) {
        for (int i = num1; i <= num2; i++)
            if (i % 2 == 0)
                list.add(i);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> evenNum = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && i <=30)
                evenNum.add(i);
            if(i % 2 == 0 && i >= 300)
                evenNum.add(i);
        }
        for (Integer i : evenNum) {
            System.out.print(i + " ");
        }

        System.out.println('\n');
        List<Integer> evenList = new ArrayList<>();
        List<Integer> evenList2 = new ArrayList<>();
        List<Integer> resultList = sortNum(0,30,evenList);
        resultList.addAll(sortNum(300,350,evenList2));

        for (Integer num : resultList) {
            System.out.print(num + " ");
        }


    }
}
