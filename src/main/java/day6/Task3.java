package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Сергей Владимирович", "физика");
        Students st = new Students("Гулов Илья");
        t.evaluate(st);

    }
}
