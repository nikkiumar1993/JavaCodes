package CollectionFramework;

import java.util.*;

public class SetTask {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Set<Integer> nums = new HashSet<>();
//        System.out.println("Please enter 5 numbers");
//
//
//        for (int i = 0; i <5 ; i++) {
//            int numbers = scanner.nextInt();
//
//            nums.add(numbers);
//        }
//        System.out.println(nums);
//        Iterator<Integer> list = nums.iterator();
//        while(list.hasNext()){
//            if(list.next()%2==1){
//                list.remove();
//            }
//        }
//        System.out.println(nums);

        Set<String> colors1 = new HashSet<>();
        colors1.add("red");
        colors1.add("green");
        colors1.add("black");
        colors1.add("white");
        Set<String> colors2 = new HashSet<>();
        colors1.add("red");
        colors1.add("yellow");
        colors1.add("pink");
        colors1.add("white");

        Iterator<String> it = colors2.iterator();
        String col = "";

        for (int j = 0; j <4 ; j++) {

            if(colors1.contains(it.next())){
                col += it.next();
            }
        }
        System.out.println(col);



    }
}
