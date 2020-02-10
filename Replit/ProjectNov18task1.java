package Replit;

import java.util.Arrays;

public class ProjectNov18task1 {
    public static int[] extractNum(String str) {
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                num += str.charAt(i);
            }
        }
        String[] arr = num.split("");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNum("aadf2sdfg324sdvdfg")));
    }
}
