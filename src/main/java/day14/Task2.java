package day14;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

import org.apache.commons.lang3.math.NumberUtils;

public class Task2 {
    public static List<String> parseFileToStringList(File file) throws Exception {
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
        return people;

    }

    public static void main(String[] args) throws Exception {
        File file = new File("people");
        List<String> people = parseFileToStringList(file);
        String[] s = new String[people.size()];
        StringBuilder concatString = new StringBuilder();


        for (int i = 0; i < people.size(); i++) {
            s[i] = people.get(i);
            concatString.append(people.get(i) + " ");                                      //конкатинируем сроки с пробелами для дальнейшего разделения методом split()
        }

        String[] splitString = concatString.toString().split("\\s");
        int[] checkSign = new int[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            if (NumberUtils.isParsable(splitString[i])) {                         //метод для проверки массива на содержание целочисленных значений. Метод использован из подключённой библиотеки внешней "Apache"
                checkSign[i] = Integer.parseInt(splitString[i]);                 //если условие верно, числа записываем в отдельный массив
                if (checkSign[i] < 0)
                    System.out.println("Некорректный входной файл");
            }
        }

        System.out.println(Arrays.toString(s));

    }
}
