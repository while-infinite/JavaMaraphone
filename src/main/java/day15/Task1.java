package day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static List<String> readFromFile(File file){
        StringBuilder readFile = new StringBuilder();
        Scanner in = null;
        String[] keepString;

        List<String> sortList = new ArrayList<>();
        try {
            in = new Scanner(file);
            while (in.hasNextLine())
                readFile.append(in.nextLine() + ',');
        } catch (FileNotFoundException e) {
            System.out.println("Файо не найден");
        }

        keepString = readFile.toString().split(",");                        //добавляем в массив конкатинированной строки при помощи разделителя в качестве запятой
        String[][] formatString = new String[keepString.length][3];               //создаём двумерный массив, что бы доюавить туда элементы из первого массива,
        for(int i = 0; i < keepString.length; i++) {                              //разделив их при момощи ";". Это нужно для получения нужного формата вывода дынных в конечном файле
            formatString[i] = keepString[i].split(";");
        }
        for(int i = 0; i < formatString.length; i++) {
            String[] temp = new String[3];                                        //создаём временный массив для записи элементов с двумерного массива,
            for (int j = 0; j < formatString[i].length; j++) {                    //что бы полусить доступ к последнему числовому элементу двумерно массива, где указано ко-во
                 temp[j] = formatString[i][j];
            }
            int tempParseNum = Integer.parseInt(temp[2]);                         //приводим к числовому типу послений последний элемент временнго массива
            if (tempParseNum == 0) {                                              //если равняетсья 0
                String s = temp[0] + ',' + " " + temp[1] + ',' + " " + temp[2];   //конкатинируем элементы массива с запятыми и пробелами для получения нужного формата данных
                sortList.add(s);
            }
        }
        assert in != null;
        in.close();
        return sortList;
    }


    public static File writeToFile(File file, List<String> sortList){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            for(int i = 0; i < sortList.size(); i++)
                pw.println(sortList.get(i));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        assert pw != null;
        pw.close();
        return file;
    }


    public static void main(String[] args) {
        File importCSV = new File("src/main/resources/shoes.csv");
        File exportTXT = new File("src/main/resources/missing_shoes");
        List<String> sortList = readFromFile(importCSV);

        for (String list : sortList)
            System.out.println(list);
    }
}
