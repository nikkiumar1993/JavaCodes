package methods;

import java.util.Arrays;

//Given a String of numbers. Return the difference between the biggest and smallest number
public class DifferenceBigSmall {
    public static void main(String[] args) {

        System.out.println(nums("345235235"));
    }
    public static int nums(String num){
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        char biggest = arr[arr.length-1];
        char smallest = arr[0];
        int result = biggest-smallest;
        return result;
        }

    }

