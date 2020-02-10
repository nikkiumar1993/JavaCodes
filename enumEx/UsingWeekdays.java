package enumEx;


public class UsingWeekdays {
    public static void main(String[] args) {

        getWeekday(Weekdays.WEDNESDAY);
    }

    public static void getWeekday(Weekdays day) {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Regular day");
                break;
            case FRIDAY:
                System.out.println("Fridays are great");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best");
        }
    }

}
