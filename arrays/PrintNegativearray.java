package arrays;

import java.util.Arrays;

public class PrintNegativearray {
    public static void main(String[] args) {
        int[] num ={45, 23, -3, 66};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num,-3));
    }
}
