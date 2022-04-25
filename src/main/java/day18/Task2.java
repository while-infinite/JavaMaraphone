package day18;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Task2 {

    public static long count7(long num) {
        int[] digits = Long.toString(num).chars().map(c -> c - '0').toArray();
        if (digits[0] == 7) {
            if (digits.length == 1)
                return 1;
            digits[0] = digits[digits.length - 1];
            int[] copy = new int[digits.length - 1];
            System.arraycopy(digits, 0, copy, 0, digits.length - 1);
            long sum = Long.parseLong(Arrays.stream(copy).mapToObj(String::valueOf).collect(Collectors.joining()));
            return 1 + count7(sum);
        } else {
            if (digits.length == 1)
                return 0;
                digits[0] = digits[digits.length - 1];
                int[] copy = new int[digits.length - 1];
                System.arraycopy(digits, 0, copy, 0, digits.length - 1);
                long sum = Long.parseLong(Arrays.stream(copy).mapToObj(String::valueOf).collect(Collectors.joining()));
                return count7(sum);
            }

//        String test = Long.toString(num);
//        int index = test.indexOf('7');
//        if(index == -1)
//            return 0;
//        else {
//            String sub7 = test.substring(0,index) + test.substring(index + 1);
//             return 1 + count7(Long.parseLong(sub7));
//        }
        }
        public static void main (String[]args){
            long num = 6478775477277L;
            System.out.println(count7(num));

        }

}
