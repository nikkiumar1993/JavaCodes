package String;

public class SaturdayTask10 {
    public static void main(String[] args) {
        String name = "Sender: <James Bond>. From Number: [202-123-3456]. +Message: {I love programming and problem solving}”";

        System.out.println("Sender: " + name.substring(name.indexOf('<')+ 1, name.indexOf('>')));
        System.out.println("Number: " + name.substring(name.indexOf('[') + 1, name.indexOf(']')));
        System.out.println("Message: " + name.substring(name.indexOf('{')+ 1, name.indexOf('}')));
    }
}
