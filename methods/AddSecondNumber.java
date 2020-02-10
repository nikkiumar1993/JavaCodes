package methods;

import java.util.Arrays;

public class AddSecondNumber {
    public static void main(String[] args) {

        addNum("234235345", 2);
    }
    public static void addNum(String str, int num){
      int[] newstr = new int[str.length()];
        String[] strArr = str.split("");
        for (int i = 0; i < str.length() ; i++) {
           newstr[i]= Integer.valueOf(strArr[i]);
           newstr[i]+=num;
        }
        System.out.println(Arrays.toString(newstr));
    }
}
