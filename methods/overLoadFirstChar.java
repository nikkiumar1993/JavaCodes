package methods;

public class overLoadFirstChar {
    public static void main(String[] args) {
       firstChar("Nikki");
       firstChar("Nikki", 3);
        System.out.println(firstChar("Nikki is my name", 3, 8));
    }
    public static void firstChar(String str){
        System.out.println(str.charAt(0));
    }
    public static void firstChar(String str, int num){
        System.out.println(str.charAt(num));
    }
    public static int firstChar(String str, int num1, int num2){

       return str.substring(num1,num2).length();
    }
}
