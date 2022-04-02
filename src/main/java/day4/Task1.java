package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];

        int moreEight = 0;
        int equalsOne = 0;
        int evenVal = 0;
        int oddVal = 0;
        int sumAr = 0;

        for(int i = 0; i < ar.length; i++){
            ar[i] = (int) (Math.random() * (10 - 1) + 1);
            if(ar[i] > 8) moreEight++;
            if(ar[i] == 1) equalsOne++;
            if(ar[i] % 2 == 0) evenVal++;
            if(ar[i] % 2 != 0) oddVal++;
            sumAr += ar[i];
        }
        System.out.println("Введено число " + n + '.' + "Сгенерирован следующий массив:\n" + Arrays.toString(ar) + '\n');
        System.out.println("Информация о массиве:\n" + "Длинна массива: " + ar.length + '\n' + "колличесво чисел больше 8: " + moreEight + '\n' +
                           "Колличество чиесл равных 1: " + equalsOne + '\n' + "Колличество чётных чисел: " + evenVal + '\n' + "Колличество нечётных чисел: " +
                           oddVal +'\n' + "Сума всех элемнов массива: " + sumAr);

    }
}
