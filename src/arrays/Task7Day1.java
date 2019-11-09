package arrays;

import java.util.Arrays;

public class Task7Day1 {
    public static void main(String[] args) {
        int[] num = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int count = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i]%2==0){
                count++;
            }
        }
        int[] evenNumbers = new int[count];

        for(int i = 0, j=0; i<num.length; i++){
            if(num[i]%2 ==0){
                evenNumbers[j] = num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

    }
}
