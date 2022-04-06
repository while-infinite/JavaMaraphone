package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] ar = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int endZero = 0;
        int sumZero = 0;

        for(int i = 0; i < 100; i++){
            ar[i] =(int) (Math.random() * 10000) ;
            if(ar[i] > max) max = ar[i];
            if(ar[i] < min) min = ar[i];
            if(ar[i] % 10 == 0) {
                endZero++;
                sumZero += ar[i];
            }
        }
        System.out.println(Arrays.toString(ar) + '\n');
        System.out.println("Максимальное число массива: " + max + '\n' + "Минимальное число массива: " + min + '\n' +
                            "Колличество чисел, заканивающихся на 0: " + endZero + '\n' + "Сумма чисел, заканичва.щихся на 0: " +
                             sumZero);
    }
}
