package loops;

import java.util.Random;

public class RandomlLoop {
    public static void main(String[] args) {
        Random random = new Random();
        String number = "";

        for(int i = 0; i<6;i++){

            int RanNum = random.nextInt(10);

           while(number.contains(RanNum + "")){
               RanNum = random.nextInt(10);
           }
           number+=RanNum;

            }
        System.out.println(number);
        }
    }

