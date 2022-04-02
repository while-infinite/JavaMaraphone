package day2;
import java.math.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y =0;
        double p = Math.pow(x,2);

        if(x>=5){
            y = (p - 10) / (x + 7);
            System.out.println("x >= 5. y = " + y);
        }
        if(x <= 5 && x >= -3){
            y = (x + 3) * (p - 2);
            System.out.println("-3 <= x <= 5. y = " + y);
        }
        else y = 420;
    }
}
