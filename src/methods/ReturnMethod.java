package methods;

public class ReturnMethod {
    public static int getThree(){
        return 3;
    }
    public static String getDate(){
        String date = "11/3/2019";
        return date;
    }

    public static void main(String[] args) {
       int a = getThree()+7;
        System.out.println(a);
        String date = getDate().replace("/","");
        System.out.println(date);

    }


}
