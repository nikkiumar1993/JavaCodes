package methods;

import java.util.Arrays;

//Create a method that will take a String array and a String.
// Increase your array capacity and add the given String as the last element of the new array. Return the new array
public class ArrayLastCapacity {
    public static void main(String[] args) {
         String[] arr = {"1", "4", "5", "6"};
         String word = "4";
        System.out.println(Arrays.toString(stringArray(arr, "5")));
        System.out.println(Arrays.toString(stringArray(arr, "hi", 2 )));
    }
    public static String[] stringArray( String[] arr, String word){
        String[] newArr = new String[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
          newArr[i] = arr[i];
        }

        newArr[newArr.length-1] = word;
        return newArr;
    }

    public static String[] increaseArrayWithClass(String[] arr, String word){
        String[] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;
        return newArr;
    }
    public static String [] stringArray(String [] arr, String word, int num){
        String[] newarr = new String[arr.length + 1];

        for (int i = 0, j = 0; j <newarr.length ; j++) {
           if(num ==j){
               newarr[j] = word;
           }else{
               newarr[j]=arr[i];
               i++;
           }
        }return newarr;
    }
}
