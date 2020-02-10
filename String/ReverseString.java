package String;

import java.util.Random;

public class ReverseString {
    public static void main(String[] args) {
        String sent = "We went to picnic today";
        String rev = "";
        for (int i = sent.length()-1; i>=0 ; i--) {
            rev+= sent.charAt(i)+ "";
        }
        System.out.println(rev);

        int[][] arr = new int[4][5];
        Random random = new Random();
        for (int row = 0; row <arr.length ; row++) {
            for (int cols = 0; cols <arr[row].length ; cols++) {
                System.out.print(arr[row][cols] + "\t");
            }
            System.out.println();
        }

    }
}
