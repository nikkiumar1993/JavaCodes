package methods;

import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) {
        int[] arr2 = {-1,2,-3,-4,4,5,6,};
       printNegNumb(arr2);
    }
    public static void printNegNumb(int[] arr){
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< 0){
                System.out.print(arr[i] + " ");
            }
        }
    }


}
