package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> gradeScale = new HashMap<>();
        gradeScale.put("A", 90);
        gradeScale.put("B", 80);
        gradeScale.put("C", 80);
        gradeScale.put("D", 60);
        gradeScale.put("F", 50);

        System.out.println(gradeScale.get("B"));
        System.out.println(gradeScale);
gradeScale.remove("F");
//        System.out.println(gradeScale.containsKey("A"));
//        System.out.println(gradeScale.containsKey("G"));
//        System.out.println(gradeScale.containsValue(20));
        System.out.println(gradeScale);
       Set<String> keys =  gradeScale.keySet();
        System.out.println(keys);

        for (String key: keys) {
            if(key.equals("C")) gradeScale.put(key, 70);

            System.out.println(key + " " + gradeScale.get(key));
        }



    }
}
