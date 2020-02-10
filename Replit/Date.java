package Replit;


import java.util.Calendar;

public class Date {


    private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month;
    int day;
    int year;

    /*
     * Initialized a new date from the month, day and year.
     * @param month the month (between 1 and 12)
     * @param day the day (between 1 and 28-31, depending on the month)
     * @param year the year

     */


    public Date(int month, int day, int year) {
        if (!isValid(month, day, year)) {
            System.out.println("Invalid Date");
            throw new IllegalArgumentException();
        }
        // TO DO
        this.day = day;
        this.month = month;
        this.year = year;


    }

    /*
     * @return month of that month
     */
    public int getMonth() {
        return this.month;
    }

    /*
     * @return day of that day
     */
    public int getDay() {
        return this.day;
    }

    /*
     * @return year of that year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * This method checks if a given date is a valid calendar date
     *
     * @param m month
     * @param d day
     * @param y year. (A year is no less than 1900, and no greater than 2100)
     * @return true if the given date is a valid calendar date. false otherwise
     */
    public static boolean isValid(int m, int d, int y) {
        //TO DO
        if (y >= 1900 && y <= 2100) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 && d >= 1 && d <= 31) {
                return true;
            } else if (m == 4 || m == 6 || m == 9 || m == 11 && d >= 1 && d <= 30) {
                return true;
            } else if (m == 2 && d >= 1 && d <= 29) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param year
     * @return true if the given year is a leap year. false otherwise.
     */
    public static boolean isLeapYear(int year) {
        //TO DO
        if (year >= 1900 && year <= 2100) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            }

        }
        return false;
    }

    /**
     * Compare this date to that date.
     *
     * @return {a negative integer or zero or a positive integer}, depending on whether this date is {before, equal to, after} that date
     */

    public int compareTo(Date that) {
        //TO DO

        return 0;


    }

    /**
     * Return a string representation of this date.
     *
     * @return the string representation in the format MM/DD/YYYY
     */
    public String toString() {
        //TO DO
        return this.day + "/" + this.month + "/" + this.year;
    }


    /**
     * @return the word representation of the date.
     * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen"
     */
    public String dateToWords() {
        String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] yearWords = {"Hundred", "Thousand"};

        // TO DO
        String oneToTen ="";
        if(day>=1 && day<=10){

        }
return "";

    }

    public int age() {
        Calendar cal = Calendar.getInstance();
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get(Calendar.MONTH);        //starts from 0 to 11
        int y = cal.get(Calendar.YEAR);

        int age = 0;
        // TO DO
        m++;
        age = y-this.year;
        if (this.year <= y && this.month == m && this.day > d) {
           age--;
        } else if (this.year <= y && this.day <= d || this.day >= d && this.month < m || this.month > m) {
        return age;
        }

            return age;

    }

    public static void main(String[] args) {
        Date date1 = new Date(10, 5, 1993);
        System.out.println(date1.dateToWords());

    }

}

