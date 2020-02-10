package methods;

public class Weekday {
    public static boolean weekdayorNot(String day){
        if(day.toLowerCase().equals("Saturday") || day.toLowerCase().equals("Sunday")){
            return false;
        }
        return true;



    }

    public static void main(String[] args) {

        System.out.println(weekdayorNot("Monday"));
    }
}
