package day2;
import java.math.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double p = Math.pow(x,2);
        double y = 0;
        double condition1 = 0;
        double condition2 = 0;
        double condition3 = 0;



            if (x >= 5) {
                condition1 = (p - 10) / (x + 7);
                y = condition1;
            }
            if (x < 5 && x > -3) {
                condition2 = (x + 3) * (p - 2);
                y = condition2;
            }
            if (condition1 == 0 && condition2 == 0){
                condition3 = 420;
                y = condition3;
            }
        System.out.println(y);

        }



    }

