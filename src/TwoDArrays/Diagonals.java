package TwoDArrays;

import java.util.Scanner;

public class Diagonals {
    //Create a method that will take 2d array and return the difference between the sum of the diagonals
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        System.out.println(differenceSum(arr));
    }
    public static int differenceSum(int [][] arr){
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0,j=arr.length-1; i<arr.length;i++, j--){

               sum1+=arr[i][i];
                 sum2+=arr[j][i];

        }
        return Math.abs(sum1-sum2);
    }
}
