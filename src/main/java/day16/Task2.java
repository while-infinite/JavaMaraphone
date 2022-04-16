package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void intNumToFile(File file){
        Random random = new Random();
        PrintWriter pw = null;
        int[] num = new int[1000];

        try {
            pw = new PrintWriter(file);
            for(int i = 1; i <=num.length; i++)
                pw.println(random.nextInt(100));
        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден");
        }
        assert pw != null;
        pw.close();
    }

    public static void doubleNumToFile(File readFrom, File writeTo){
        Scanner in = null;
        PrintWriter pw = null;
        StringBuilder keepString = new StringBuilder();
        int counter = 0;
        double[] average = new double[50];
        int arrIndex = 0;
        double sum = 0;

        try{
            in = new Scanner(readFrom);
            while(in.hasNextLine())
                keepString.append(in.nextLine() + " ");

        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден");
        }
        assert in != null;
        in.close();

        String[] arrNum = keepString.toString().split(" ") ;
        int[] num = new int[arrNum.length];
        for(int i = 0; i < num.length; i++)
            num[i] = Integer.parseInt(arrNum[i]);
        for(int i = 0; i < 1000; i++){
            counter++;
            sum += num[i];
            if(counter == 20){
                average[arrIndex] = sum/counter;
                arrIndex++;
                counter = 0;
                sum = 0;
            }
        }
        try {
            pw = new PrintWriter(writeTo);
            for (double i : average) {
                pw.println(i + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        assert pw != null;
        pw.close();
    }

    public static void printResult(File file){
        Scanner in = null;
        StringBuilder keepString = new StringBuilder();
        double sumOfDouble = 0;

        try {
            in = new Scanner(file);
            keepString.append(in.nextLine() + " ");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String[] arrNum = keepString.toString().split(" ");
        double[] num = new double[arrNum.length];
        for(int i = 0; i < num.length; i++)
            num[i] = Double.parseDouble(arrNum[i]);
        for (double i : num)
            sumOfDouble += i;
        assert in != null;
        in.close();
        System.out.printf("%.0f", Math.floor(sumOfDouble));
    }

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        intNumToFile(file1);
        doubleNumToFile(file1,file2);
        printResult(file2);



    }
}
