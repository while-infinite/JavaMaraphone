package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

        public static void printSumDigits(File file) throws Exception{
            Scanner in = null;
            String line = "";
            int count = 0;
            int sum = 0;
            try {
                in = new Scanner(file);
                line = in.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }

            String[] s = line.split(" ");
            int[] numbers = new int[10];

            for (int i = 0; i < s.length; i++) {
                String temp = s[i];
                numbers[i] = Integer.parseInt(temp);
                sum += numbers[i];
                count++;
            }
            if (count != 10)
                throw new Exception("Некорректный входной файл");
            System.out.println(sum);

            assert in != null;
            in.close();

        }

        public static void main(String[] args) throws Exception {
            File file = new File("text");
            printSumDigits(file);

        }
    }