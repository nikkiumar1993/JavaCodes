package methods;

import java.util.Arrays;

public class RaplaceNegative {
    public static void main(String[] args) {
        int[] arr2 = {2, -1, 2, -4, -5};

        arrNum(arr2, 100);
    }
    public static void arrNum(  int[] arr, int num ){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<0) {
                arr[i] = num;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
