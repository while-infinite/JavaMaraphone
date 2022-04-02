package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] ar = new int[12][8];
        int sumLine = 0;
        int maxLine = 0;
        int lineNumber = 0;
        int maxLineNumber = 0;

        for(int i = 0; i < ar.length; i++){
            lineNumber++;
            System.out.print("Строка - " + lineNumber + " -- ");

            for(int j =0; j < ar[i].length; j++){
                ar[i][j] = (int)(Math.random() * 50);
                System.out.print(ar[i][j] + " ");
                sumLine += ar[i][j];
                if(sumLine > maxLine) {
                    maxLine = sumLine;
                    maxLineNumber = lineNumber;
                }
                if(j == ar[i].length-1) {
                    System.out.println(" \t\t\t// Сумма строки = " + sumLine + '\n');
                    sumLine = 0;
                }

            }
        }
        System.out.println("Наибольшее значение " + maxLine+ " у " + maxLineNumber + "-й строки. " );
    }
}
