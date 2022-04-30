package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {

    public static HashMap<Integer, Point> readFromFile(File file) {
        Scanner in = null;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        HashMap<Integer, Point> taxi = new HashMap<>();


        try {
            in = new Scanner(file);
            while (in.hasNextLine()) {
                sb.append(in.nextLine() + " ");

            }
            String[] splitArr = sb.toString().split(" ");
            for (int i = 0; i < splitArr.length; i++) {
                count++;
                if (count % 3 == 0) {
                    int id = Integer.parseInt(splitArr[i - 2]);
                    int x = Integer.parseInt(splitArr[i - 1]);
                    int y = Integer.parseInt(splitArr[i]);
                    taxi.put(id, new Point(x, y));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        assert in != null;
        in.close();
        return taxi;
    }


    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        HashMap<Integer, Point> taxi = readFromFile(file);
        HashMap<Integer, Point> taxiInRange = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты квадарата для поиска машины: x1, y1, x2, y2");
        System.out.print("Координаты x1: ");
        int x1 = in.nextInt();
        System.out.print("Координаты y1: ");
        int y1 = in.nextInt();
        System.out.print("Координаты x2: ");
        int x2 = in.nextInt();
        System.out.print("Координаты y2: ");
        int y2 = in.nextInt();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);


        for (Map.Entry<Integer, Point> entry : taxi.entrySet()) {
            if(entry.getValue().getX() > point1.getX() && entry.getValue().getY() > point1.getY() &&
                    entry.getValue().getX() < point2.getX() && entry.getValue().getY() < point2.getY()){
                if ((!entry.getValue().equals(point1) && !entry.getValue().equals(point2)))
                    taxiInRange.put(entry.getKey(), entry.getValue());
            } else {
                if(entry.getValue().getX() > point2.getX() && entry.getValue().getY() > point2.getY() &&
                        entry.getValue().getX() < point1.getX() && entry.getValue().getY() < point1.getY()) {
                    if ((!entry.getValue().equals(point1) && !entry.getValue().equals(point2)))
                    taxiInRange.put(entry.getKey(), entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, Point> entry : taxiInRange.entrySet())
            System.out.println(entry.getKey());

        System.out.println("Колличество доступных машин: " + taxiInRange.size());


    }
}

