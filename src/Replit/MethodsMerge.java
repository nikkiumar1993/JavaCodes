package Replit;

import java.util.Arrays;

public class MethodsMerge {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = { 4, 5, 6};
        System.out.println(Arrays.toString(mergR(a, b)));
    }
    public static int[] mergR(int[] a,int[] b) {
        int[]c = new int [a.length + b.length];

        for(int i = 0; i < a.length; i++){
            c[i]=a[i];
        }
        for(int i = 0; i<b.length;i++){
            c[i+a.length]=b[i];
        }
        return c;



    }
}
