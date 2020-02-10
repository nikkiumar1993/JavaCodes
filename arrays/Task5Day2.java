package arrays;

public class Task5Day2 {
    public static void main(String[] args) {
        String[] products = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;
        for(String product: products){
            char start = product.charAt(0);
            if(start>=65 && start<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
