package arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {4, 32, 6, 1, 8};
        for(int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
        System.out.println();

        for(int number: num){
            if(number% 2 ==0){
                System.out.println(number);
            }
        }

        String[] names = {"adam", "james", "bob"};
        for(String name: names){
            if(name.contains("a")){
                System.out.println(name);
            }
        }
    }
}
