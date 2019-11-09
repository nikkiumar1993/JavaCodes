package methods;

public class StringInt {
    public static void main(String[] args) {
        stringInt("Nikki", 4);
    }
    public static void stringInt(String length, int num ){
        if(num == length.length()){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
