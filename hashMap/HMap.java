package hashMap;

import java.util.HashMap;

public class HMap {
    public static void characterCount(char [] arrCh){
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character ch: arrCh){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        char [] ch = {'a', 'b', 'c', 'c', 'a', 'c'};
        characterCount(ch);
    }
}
