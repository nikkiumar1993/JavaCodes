package TwoDArrays;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [] [] groups = new int [3] [4];
        int [] num = {1, 2, 3};
        groups [0] = num;
        System.out.println(Arrays.deepToString(groups));
        String [] [] str = new String[4][4];
        System.out.println(Arrays.deepToString(str));
    }
}
