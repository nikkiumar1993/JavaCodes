package Replit;

import java.util.Arrays;

public class PopulateArray {
    public static int[] populate(int[] r)
    {
        for(int i = 1; i<= r.length+1; i++){
            r[i]=i;
        }return r;


    }

    public static void main(String[] args)
    {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
