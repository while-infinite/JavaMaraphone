package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        HashMap<Integer, String> hmap = new HashMap<>();
        HashMap<String, Integer> countOfRepeat = new HashMap<>();
        LinkedHashMap<String, Integer> maxRepeat = new LinkedHashMap<>();
        int count = 0;
        int i = 0;
        try {
            Scanner in = new Scanner(file).useDelimiter("[><<.,:;()?!\"\\s–>><]+");
            while (in.hasNext()) {
                hmap.put(i, in.next());
                count = 0;
                if (countOfRepeat.containsKey(hmap.get(i))){                        //проверяем, содержиться ли в объекте countOfRepeat -> "j"-ый элемент объекта hmap
                    i++;
                    continue;                                                        //если,да, то переходим к следующему элементу
                }
                for (Map.Entry<Integer, String> entry : hmap.entrySet())
                    if (hmap.get(i).equals(entry.getValue())) {                      //проверяем есть ли другие элементы с таким же ключом как в hmap.get(j) в этом же списке
                        count++;                                                     //если да да инкреминтируем счётчик
                        countOfRepeat.put(entry.getValue(), count);                  //перезаписываем значение элемента в объекте countOfRepeat
                    }
                i++;
            }

            count = 0;
            while (count < 100) {
                int maxValue = 0;
                String key = "";
                for (Map.Entry<String, Integer> entry : countOfRepeat.entrySet()) {
                    if (entry.getValue() > maxValue) {
                        maxValue = entry.getValue();
                        key = entry.getKey();
                    }
                }
                maxRepeat.put(key, maxValue);                                           //добавляем новый элемент с макс знач. в новый объект
                countOfRepeat.remove(key);                                              //во избежании повторного сравнения с уже проверенным элеменом удаляем его из объекта
                count++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        i = 0;
        for (Map.Entry<String, Integer> entry : maxRepeat.entrySet()) {
            System.out.println(i + " - " + "\"" + entry.getKey() + "\"" + " : " + entry.getValue());
            i++;
        }

        //Чичиков - 605

    }
}
