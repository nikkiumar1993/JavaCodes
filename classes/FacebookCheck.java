package classes;

public class FacebookCheck {
    public static void main(String[] args) {
        Facebook user1 = new Facebook("nikkiumar","asdfadsf", "Nikki", 26, 324);
        Facebook user2 = new Facebook("mumar", "a345dsf", "Madina", 18, 4999);
        user1.info();
        user2.info();
        System.out.println();
        user1.sendFriendRequest(user1, user2);
        user1.info();
        user2.info();

    }
}
