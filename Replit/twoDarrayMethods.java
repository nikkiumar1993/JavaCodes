package Replit;

import java.util.Arrays;

public class twoDarrayMethods {
    public static void main(String[] args) {
        int[][] arr = {{1,1,2,3,4}, {1,2,4,5,6}};
        System.out.println(Arrays.deepToString(scalar(arr,2)));
    }
    public static int[][] scalar(int[][] matrix ,int n) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                matrix[i][j]= matrix[i][j]*n;
            }
        }return matrix;

    }

}
