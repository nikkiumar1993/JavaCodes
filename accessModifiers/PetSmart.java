package accessModifiers;

import inheritance.Dell;

public class PetSmart {
    public static void main(String[] args) {
        Dog dog = new Dog();

     Huskey huskey = new Huskey();
     huskey.name = "Rex";
     huskey.getAge(3);
     huskey.bark();
        System.out.println(huskey.name);
        huskey.furType = "Special fur";
        huskey.liveInCold();

        CodingBootcamp obj1 = new CodingBootcamp();
        obj1.name = "Cybertek";

        obj1.hostEvent("December 27");

        Dell dell = new Dell();
        dell.turnOn();



    }
}
