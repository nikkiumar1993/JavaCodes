package methods;

public class OverLoadPractice {
    public static void main(String[] args) {
        System.out.println(firstSecondFirst("Nikki","Umarova"));

        System.out.println(firstSecondFirst("Nikki", "Umarova", 4));
    }
    public static String firstSecondFirst( String first, String second){
        return first + second + first;
    }
    public static String firstSecondFirst(String first, String second, int times){
        String newWord = "";
        if(times<=0){
            return "";
        }
        for(int i = 0; i< times; i++){
            newWord += first;

            newWord += second;
        }
        return newWord.substring(0, newWord.length() - second.length());
    }
}
