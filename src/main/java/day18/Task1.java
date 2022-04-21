package day18;

public class Task1 {
    public static int recursionSum(int[] num, int n, int sum){
        if(n < 0)
            return sum;
        sum += num[n];
       return recursionSum(num, n-1, sum);
    }
    public static void main(String[] args) {
        int[] num = {1,10,1241,50402,-50,249,10215,665,2295,7,311};
        int sum = 0;
        System.out.println(recursionSum(num, num.length-1, sum));
    }
}
