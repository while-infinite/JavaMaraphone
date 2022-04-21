package day18;


public class Task2 {

    public static long count7(long num){
        String test = Long.toString(num);
        int index = test.indexOf('7');
        if(index == -1)
            return 0;
        else {
            String sub7 = test.substring(0,index) + test.substring(index + 1);
             return 1 + count7(Long.parseLong(sub7));
        }
    }
    public static void main(String[] args) {
        long num = 6477727477277L;
        System.out.println(count7(num));

    }
}
