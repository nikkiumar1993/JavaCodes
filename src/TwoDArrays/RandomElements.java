package TwoDArrays;

import java.util.Arrays;
import java.util.Random;

public class RandomElements {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(elements(2,5)));
    }
    public static int[][] elements( int rows, int cols){
        Random random = new Random();
        int [][] arr = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for (int j = 0; j < cols ; j++) {
                arr[i][j] = random.nextInt(1000);

            }
        }return arr;
    }
}
