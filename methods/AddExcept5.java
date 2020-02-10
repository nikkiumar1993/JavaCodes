package methods;

import java.util.Arrays;

public class AddExcept5 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 55};
        System.out.println(except5(arr));
        System.out.println(except5(arr, 4));
    }

    public static int except5(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            String s = num + "";
            if (s.endsWith("5")) {
                continue;
            }
//            if(num%10 !=5){
//                sum+=num;
//            }
            sum += num;
        }
        return sum;
    }

    public static int except5(int[] arr, int number) {
        int sum = 0;
        for (int num : arr) {
            String s = num + "";
            if (!s.endsWith(number + "")) {
                sum += num;
            }
        }
        return sum;
    }
}