package polymorphism2;

public class Park {
    public static void main(String[] args) {
       Animal dog = new GermanShepherd();

      String s = dog.type;
      dog.breath();
       Trainable dog2 = new GermanShepherd();
       String name = dog2.name;
       Animal joe = new GermanShepherd();
//       Animal joe = new GermanShepherd();
//       Dog joe2 = (Dog) joe;
//       GermanShepherd joe3 = (GermanShepherd)joe2;
//       Trainable joe4 = (Trainable)joe;
       ((GermanShepherd)joe).bark();

    }
}
