package methods;

public class NoToStringMethod {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 3};
        noString(arr);
    }
    public static void noString( int []num) {
        String newArr = "";
        for (int i = 0; i <num.length ; i++) {
            newArr+= num[i] + ", ";

        }System.out.print("[" + newArr.substring( 0, newArr.length()-2) + "]");
    }
}
