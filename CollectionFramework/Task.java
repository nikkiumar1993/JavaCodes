package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4");
        int num = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
        map.put("Forth",4);

        for (String key: map.keySet()) {
            if(!map.containsValue(num)){
            System.out.println("Invalid Number");
            break;
        }else{
                if(map.get(key)==num)
            System.out.println(key);
        }

        }
    }
}
