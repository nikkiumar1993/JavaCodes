package arrays;

import java.util.Arrays;

public class Biggest2Numbers {
    public static void main(String[] args) {
        int[] arr = {23, 1, 34, 3, 54, 54, 51, 54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String checked = "";
        int count = 0;


        for(int i = arr.length-1; i>=0; i--){
            if(count ==2){
                break;
            }
            if(!checked.contains(arr[i]+ "")){
                System.out.println(arr[i]+ " ");
                checked+=arr[i];
                count++;
            }
        }
    }
}
