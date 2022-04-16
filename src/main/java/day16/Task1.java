package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void printResult(File file){
        Scanner in = null;
        String readFile = "";
        String[] arrNum;
        double sum = 0;
        double average = 0;
        try{
            in = new Scanner(file);
            while ((in.hasNextLine()))
                readFile = in.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        arrNum = readFile.split(" ");
        int [] num = new int[arrNum.length];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(arrNum[i]);
            sum += num[i];
        }
        average = sum/ num.length;
        String result = String.format("%.15f", average).replace(',','.');
        System.out.print(result);
        System.out.printf(" --> %.3f", average);


    }
    public static void main(String[] args) {
        File file = new File("text");
        printResult(file);
    }
}

