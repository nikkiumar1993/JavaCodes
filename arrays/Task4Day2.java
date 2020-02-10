package arrays;

public class Task4Day2 {
    public static void main(String[] args) {
        String[] city = {"Chicago", "Chicago", "New York", "Madison", "Miami", "Washington"};
        int count =0;
        boolean check = false;

        for(String cities: city){
            if(cities.contains("Chicago")) {
                check = true;
                count++;
            }
        }if(check){
            System.out.println("Windy city found " + count + " times");

            }else{
                System.out.println("Windy city not found");
            }
        }
    }

