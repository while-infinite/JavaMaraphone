package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder("");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            s += String.valueOf(i + " ");
        }
        System.out.print(s);
        System.out.print('\n');
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime);

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
        System.out.print('\n');
        long stopTime2 = System.currentTimeMillis();
        System.out.println(stopTime2);

    }
}
