package methods;
//Create a method that will count how many even numbers there is from the given array and return the value
public class countEvenNum {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4, 5};
        System.out.println(evenNum(arr));
    }

    public static int evenNum(int[] num) {

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;

            }

        }return count;
        }



}