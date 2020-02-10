package methods;

public class Extract {
    public static void main(String[] args) {
        System.out.println(nums("About 293,329,202 result (0.78 seconds)"));
        System.out.println(seconds("About 293,329,202 result (0.78 seconds)"));
    }
    public static String nums(String num){
        String nums = num.substring(num.indexOf(" ")+1, num.indexOf(","))+ num.substring(num.indexOf(","), num.lastIndexOf(","));
        return nums;
    }
    public static String seconds( String sec){
String secs = sec.substring(sec.indexOf("(")+1, sec.lastIndexOf(" "));
        return secs;
    }
}
