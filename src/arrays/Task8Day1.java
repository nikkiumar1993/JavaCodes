package arrays;

import java.util.Arrays;

public class Task8Day1 {
    public static void main(String[] args) {
        int[] num = {3, 30, 14, 6, 50, 20};
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }


            while (max != 0) {
                for (int k = 0; k < num.length; k++) {
                    num[k] /= 2;
                }
            }
            System.out.println(Arrays.toString(num));

        }
    }
}
