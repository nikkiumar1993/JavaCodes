package variablesBatch14;

public class Aboutme {
    public static void main(String[] args) {
        String firstName = "Nikki";
        String lastName = "Umarova";
        String Email = firstName + lastName + "@gmail.com";

        System.out.println();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + Email);


        // task 2

        short chairs = 5;
        System.out.println(chairs);

        long moreChairs = chairs;
        System.out.println(moreChairs);

        int lessChairs = (int)moreChairs;
        System.out.println(lessChairs);
        System.out.println((double)lessChairs);

    }
}
