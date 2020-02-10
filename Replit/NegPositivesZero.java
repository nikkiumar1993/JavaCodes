package Replit;

import java.util.Scanner;

public class NegPositivesZero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    // Create a method here and call it "plus_minus"

    public static void plus_minus(int[] arr){
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("positives:" + pos + ", " + "negatives:" + neg + ", " + "zeros:" + zero);
    }
}
