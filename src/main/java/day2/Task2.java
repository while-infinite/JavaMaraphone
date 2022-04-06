package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] s = new String[2];
        s = in.nextLine().split(" ");
        int[] val = new int[2];
        val[0] = Integer.parseInt(s[0]);
        val[1] = Integer.parseInt(s[1]);

        if (val[0] >= val[1]) {
            System.out.println("Некорректный ввод");
        }else {
            for (int y = val[0] + 1; y < val[1]; y++) {
                double dev = y % 5;
                double value = y % 10;
                if (dev == 0 && value != 0) {
                    System.out.print(y + " ");
                }

            }
        }

    }
}
