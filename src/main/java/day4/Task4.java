package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] ar = new int[10];
        int[] temp = new int[3];
        int sum = 0;
        int maxSum = 0;
        int indexLine = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 15);
            System.out.print(ar[i] + " ");
        }
        System.out.println(" ");

        for(int i = 0; i < ar.length-2; i++) {
            sum += ar[i];
            sum += ar[i+1] ;
            sum += ar[i+2];
                if(maxSum < sum){
                    maxSum = sum;
                    indexLine = i+1;
                    temp[0] = ar[i] ;
                    temp[1] = ar[i+1];
                    temp[2] = ar[i+2];
                }
                sum = 0;
        }
        System.out.println("Тройка с максимальной суммой: " + Arrays.toString(temp));
        System.out.println("Сумма: " + maxSum + '\n' + "Индекс первого элемента тройки: " + indexLine);



    }
}
