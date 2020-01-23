package arrays;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean helper (int num){
        for (int i = 2; i <num ; i++) {
            if(num%i == 0)return false;
        }return true;
    }

    public static ArrayList<Integer> primeNumber(int num){
        ArrayList<Integer>  prime= new ArrayList<Integer>();
        for (int i = 1; i < num; i++) {
            if(helper(i)){
                prime.add(i);
            }
        }
        return prime;
    }

    public static String fibonacci(int num){
        String fib = "0 1 ";
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i <num ; i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            if(sum<=num){
                fib+= sum + " ";
            }
        }return fib;
    }
    public static boolean palindrome(long num){
        long temp = num;
        long reverse = 0;
       while (temp!=0){
           reverse*=10;
           reverse+=temp%10;
           temp/=10;
       }if(num==reverse){
           return true;
        }return false;
    }
    public static boolean armstrong(int num){
        int sum= 0;
        int times = 0;
        for (int i = 0; i <num ; i++) {

            sum = 0;
            while(i>0){
                times = i%10;
                sum+=(times *times *times);
                i/=10;
            }if(sum == i){
                return true;
            }

        }return false;

    }

    public static void main(String [] args ) {
Object a, b,c;
a= new String("A");
        b= new String("B");
        c=a;
        a=b;
        System.out.println("" + c);

        //System.out.println(primeNumber(50));
//        System.out.println(fibonacci(23));
       // System.out.println(palindrome(1000));
       // System.out.println(armstrong(53));
    }
}
