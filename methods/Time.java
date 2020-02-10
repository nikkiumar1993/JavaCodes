package methods;
//— Hours should be in the range 1-12, minutes should be in the range from 1 to 59. If either of those information provided is not valid, do not continue your program, just print “Invalid time information given
//        input: 4, 39, true
//        Output: 4 : 39 AM
public class Time {
    public static void main(String[] args) {
time(4, 39, true);
    }

    public static void time( int hour, int minutes, boolean valid){
        if(hour>=1 && hour <=12 && minutes>=1 && minutes<=59){
           if(valid =true) {
               System.out.println(hour + " : " + minutes + " AM");
           }else if(valid=false){
               System.out.println(hour + " : " + minutes + " PM");
           }
        }else{
            System.out.println("Invalid format");
        }

    }

}
