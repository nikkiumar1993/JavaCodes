package arrays;

import java.util.Arrays;

public class Task3Day2 {
    public static void main(String[] args) {
        int[] num1 = {3,2,6,43,7,20};
        int[] num2 = {2,7,-10,10,-5,2};
        int[] total = new int[num1.length];
        for(int i =0; i<num1.length; i++){
            total[i] = num1[i] + num2[i];
        }
        System.out.println(Arrays.toString(total));
    }
}
