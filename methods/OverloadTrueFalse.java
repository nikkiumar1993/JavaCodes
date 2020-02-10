package methods;

public class OverloadTrueFalse {
    public static void main(String[] args) {

        System.out.println(containsSecondword("Nikki is my name", "Nikki"));
        System.out.println(containsSecondword("Nikki is my name is Nikki Nikki", "Nikki", 3));
    }
    public static boolean containsSecondword(String first, String second){
        if(first.toLowerCase().startsWith(second.toLowerCase())){
            return true;
        }
        return false;
    }
    public static boolean containsSecondword(String word, String start, int num){
        int count = 0;
        for(int i=0; i < word.length() - start.length() + 1 ; i++) {
            String sub = word.substring(i, i + start.length());
            //   System.out.println(sub);
            if(sub.equals(start)) {
                count++;
            }
        }

        if(count == num){
                return true;
            }
            return false;

    }

}
