package methods;

public class overLoading {
    public static void main(String[] args) {
        jump();
        jump("nike");
        jump(6);
        String [] arr = {"d"};
        jump(arr);
        System.out.println(jump(arr));
    }
    public static void jump(){
        System.out.println("You dont get far");
    }

    public static void jump(String shoes){
        System.out.println("The shoes made you go farther");
    }
    public static void jump(int distance){
        System.out.println("You jumped " + distance);
    }
    public static String jump(String [] arr){
        return "jumped by array";
    }
}

