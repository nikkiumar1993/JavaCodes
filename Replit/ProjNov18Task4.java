package Replit;

public class ProjNov18Task4 {
    public static boolean isAnagram(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int count = 0;
        boolean check = true;
        if (word1.length()==word2.length()) {
            for (int i = 0; i < word1.length(); i++){
                for( int j = 0; j < word1.length(); j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        count ++;
                    }
                }
            }
            if (count == word1.length()) {
                check = true;
            }else {
                check = false;
            }
        } else {
            check = false;
        }
        return check;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("mama", "mama"));
    }
}
