package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

public class Task3 {
    public static List<Person> parseFileToObjList(File file) throws Exception {
        Scanner in = null;
        StringBuilder keepString = new StringBuilder();
        List<Person> person = new ArrayList<>();

        try {
            in = new Scanner(file);
            while (in.hasNextLine())
                keepString.append(in.nextLine() + " ");                   //конкатинируем сроки с пробелами для дальнейшего разделения методом split()
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String[] splitString = keepString.toString().split(" ");
        for (int i = 0; i < splitString.length; i++) {
            int tempNum = 0;
            if (NumberUtils.isParsable(splitString[i])) {                   //метод для проверки массива на содержание целочисленных значений.
                tempNum = Integer.parseInt(splitString[i]);                //если условие верно, то записываем во временную переменную
                if (tempNum < 0)
                    throw new Exception("Некорректный входной файл");
                person.add(new Person(splitString[i - 1], tempNum));          //передаём в аргументы объекта числовое значение из временной перемнной и строковое значение из предыдущего элемента
            }
        }
        return person;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("people");
        for (Person list : parseFileToObjList(file))
            System.out.println(list);


    }
}
