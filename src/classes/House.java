package classes;

public class House {
    String type;
    String address;
    int numRooms;

    public void info(){
        System.out.println("Type: "+ type);
        System.out.println("Address: " + address);
        System.out.println("Number of rooms: " + numRooms);
    }
}
