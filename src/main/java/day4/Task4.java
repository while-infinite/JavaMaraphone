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
            int[] temp1 = new int[3];
            int count = 0;
            for(int j = i; j <= i + 2; j++){
                sum += ar[j];
                temp1[count] = ar[j];
                count++;
                if(maxSum < sum){
                    maxSum = sum;
                    indexLine = i + 1;
                    temp  = temp1.clone();
                }
            }
                sum = 0;
        }
        System.out.println("Тройка с максимальной суммой: " + Arrays.toString(temp));
        System.out.println("Сумма: " + maxSum + '\n' + "Индекс первого элемента тройки: " + indexLine);



    }
}
