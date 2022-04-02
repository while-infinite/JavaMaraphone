package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int flour = in.nextInt();
        if (flour == 1 || flour == 2 || flour == 3 || flour == 4) {
            System.out.println("Малоэтажный дом");
        }
        if (flour == 5 || flour == 6 || flour == 7 || flour == 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (flour >= 9) {
            System.out.println("Многоэтажный дом");
        }
        if (flour <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}