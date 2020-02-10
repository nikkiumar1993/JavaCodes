package TwoDArrays;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[ ] [ ] numbers = {{1,2,3,9}, {5,4} , {7,8,9}};

        for(int[] inner: numbers){
            Arrays.sort(inner);
            for(int element : inner){
                System.out.println(element);}
        }

    }
}
