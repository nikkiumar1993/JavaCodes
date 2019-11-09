package arrays;

import java.util.Arrays;

public class Task3Day1 {
    public static void main(String[] args) {
        String[] colors = {"red", "yellow", "blue", "black"};

        for(int i = 0; i<colors.length; i++){
//            System.out.println("color" + (i+1) + " is " + colors[i]);
            if(colors[i].length()>=4){
                System.out.println(colors[i]);

            }
        }  System.out.println(Arrays.toString(colors));
    }
}
