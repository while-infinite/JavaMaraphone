package day14;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import org.apache.commons.lang3.math.NumberUtils;

public class Task2 {
        public static List<String> parseFileToStringList (File file) {
            Scanner in = null;
            List<String> people = new ArrayList<>();
            try {
                in = new Scanner(file);
                while (in.hasNext()) {
                    people.add(in.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
            assert in != null;
            in.close();
            String[] keepString  = new String[people.size()];

            for (int i = 0; i < people.size(); i++)
                keepString[i] = people.get(i);                                        //конкатинируем сроки с пробелами для дальнейшего разделения методом split()

            int[] checkSign = new int[keepString.length];
            for (int i = 0; i < checkSign.length; i++) {
                if (NumberUtils.isParsable(keepString[i])) {                         //метод для проверки массива на содержание целочисленных значений. Метод использован из подключённой библиотеки внешней "Apache"
                    checkSign[i] = Integer.parseInt(keepString[i]);                  //если условие верно, числа записываем в отдельный массив
                    try {
                        if (checkSign[i] < 0)
                            throw new Exception("Некорректный входной файл");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            return people;

        }

        public static void main (String[]args){
            File file = new File("people");
            List<String> people = parseFileToStringList(file);

            for (String list : people) {
                System.out.println(list);
            }
        }
    }