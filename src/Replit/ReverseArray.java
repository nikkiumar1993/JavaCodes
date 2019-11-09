package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int middle =nums.length/2;
        int temp = nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i] == middle ){
            }else{
                nums[i+1]=nums[nums.length-1];
            nums[nums.length-1] = temp;
            }

        }
        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}


