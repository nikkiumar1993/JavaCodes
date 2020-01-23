package classes;

public class Facebook {
    String userName;
    String password;
    String name;
    int age;
    int numOfFriends;

    public Facebook(String userName, String password) {
        if (password.contains(userName)) {
            System.out.println("Password contained username");
            this.password = "password";

        } else {
            this.password= password;
        }
        this.userName = userName;
    }

    public Facebook(String userName, String password, String name) {
        this(userName, password);

        for (int i = 0; i < name.length(); i++) {
            if (name.toUpperCase().charAt(i) >= 65 && name.toUpperCase().charAt(i) <= 95) {
                this.name = name;
            } else {
                System.out.println("Invalid name");
                this.name = "no name";
            }
        }
    }

    public Facebook(String userName, String password, String name, int age, int numOfFriends) {
        this(userName, password, name);
        if (age < 0) {
            System.out.println("Invalid number of age");
        } else {
            this.age = age;
        }
        if (numOfFriends < 0 || numOfFriends > 5000) {
            System.out.println("Invalid number of Number of Friends");
        } else {
            this.numOfFriends = numOfFriends;
        }
    }

    public void info() {
        System.out.println("Username " + userName);
        System.out.println("Password " + password);
        System.out.println("Age " + age);
        System.out.println("Number of friends " + numOfFriends);
    }

    public boolean sendFriendRequest(Facebook user1, Facebook user2) {
        if (user1.numOfFriends == 5000) {
            System.out.println("You have reached the limit of friends.");
            return false;
        } else if (user2.numOfFriends == 5000) {
            System.out.println(user2.name + " cannot accept any more friend requests.");
            return false;
        } else {
            System.out.println("Friend request was sent to " + user2.name);
            user1.numOfFriends++;
            user2.numOfFriends++;

            return true;
        }


    }
}
