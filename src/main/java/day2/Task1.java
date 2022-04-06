package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int flour = in.nextInt();
        if (flour <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (flour > 4 && flour <= 8) {
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