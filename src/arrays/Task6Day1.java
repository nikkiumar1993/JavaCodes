package arrays;

import java.util.Arrays;
import java.util.Random;

public class Task6Day1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] num = new int[50];

        for(int i = 0; i<num.length; i++){
            num[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(num));
    }
}
