package String;
import java.util.*;

public class SendMessage {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = input.nextLine();


        if (message.length()>= 15) {
          System.out.println("Message sent");
          int num = random.nextInt(2);
          if(num == 1) {
              System.out.println("Message delivered");
          }else{
              System.out.println("Not delivered");
          }

        }else{
            System.out.println("Message too short and  not sent");
        }

    }
}
