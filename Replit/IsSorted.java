package Replit;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,3};
        System.out.println(isSort(num));
    }
    public static boolean isSort(int[] nums)
    {
        boolean sort = true;

        for(int i = 0; i< nums.length-1; i++){
            if(nums[i]> nums[i+1]){
                sort = false;
            }
        }return sort;



    }
}
