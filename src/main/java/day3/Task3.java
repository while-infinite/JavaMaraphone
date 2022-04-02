package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 0;

        for(; count < 5; count++){
            double divisible = in.nextDouble();
            double divisor = in.nextDouble();
            if(divisor == 0){
                System.out.println("Деление на 0");
                continue;}
            System.out.println(divisible/divisor);
        }
    }
}
