package Replit;

import java.util.ArrayList;

public class DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel)
    {
        int sum = 0;
        for(int i = 0; i<deliveries.size(); i++){
sum+=deliveries.get(i);
        }
        return sum/max_fuel + (sum%max_fuel);

    }
    public void removeEveryOther(ArrayList<String> words){
        for(int i = 0; i<words.size(); i++){

                words.remove(i++);

        }
        System.out.println(words);
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
