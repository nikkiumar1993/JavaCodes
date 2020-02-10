package methods;


import java.util.Arrays;
import java.util.Random;

//Create a method that will generate a random int array.
// The method takes the size of the array and the bound of the random numbers. Return the random array
public class RandomIntArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrays(4, 100)));
    }
    public static int[] arrays(int size, int bound){
        Random random = new Random();
int[] arr = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]= random.nextInt(bound);

        }return arr;



    }
}
