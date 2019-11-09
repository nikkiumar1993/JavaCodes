package methods;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println(str("Nikki"));
    }
    public static String str(String word){
        String newWord = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            newWord+= word.charAt(i);
        }
        return newWord;
    }
}
