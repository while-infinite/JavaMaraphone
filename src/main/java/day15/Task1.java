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

        keepString = readFile.toString().split(",");
        for(int i = 0; i < keepString.length; i++){
            String[] temp = keepString[i].split(";");
            int tempParseNum = Integer.parseInt(temp[2]);
            if(tempParseNum == 0)
                sortList.add(keepString[i]);
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

        System.out.println('\n');
        for(String s : readFromFile(writeToFile(exportTXT, sortList)))
            System.out.println(s);
    }
}
