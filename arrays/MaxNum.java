package arrays;

import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {
//        int[] num = {3, 30, 14, 6, 50, 20};
//        int max = num[0];
//        for (int i = 1; i < num.length; i++) {
//            if (num[i] > max) {
//                max = num[i];
//
//            }
//        }
//        System.out.println(max);
//int [] rev = new int[num.length];
//
//        for (int i = num.length-1; i>=0; i--) {
//            rev[i]=num[i];
//        }
//        System.out.println(Arrays.toString(rev));

//        System.out.println(fibonacci(10));
        int [] arr = {1,3,5,45,30,50,100,3};
        System.out.println(secondLargest(arr));
    }
    public static String fibonacci(int num){
        String fib = "0 1 ";
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i <num ; i++) {
            int sum = num1+num2;
            num1 = num2;
            num2 = sum;
            fib += sum + " ";

        }
        return fib;

    }
    public static int secondLargest(int [] arr){
        int max = arr[0];
        int sec = arr[1];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                sec = max;
                max = arr[i];
            }if(arr[i]>sec && arr[i]<max){
                sec = arr[i];
            }

        }
        return sec;
    }
}
