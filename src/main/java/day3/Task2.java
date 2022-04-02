package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        while(true){
            double divisible = in.nextDouble();
            double divisor = in.nextDouble();
            if(divisor == 0)
                break;
            else
                System.out.println(divisible/divisor);
        }
    }
}
