package accessModifiers;

import java.util.ArrayList;
import java.util.Random;

public class Dog {

   private int age;
    private String breed;
    String name;
    double weight;
    String color;
   public ArrayList<String> names;

    public void bark() {
        System.out.println("Dog is barking");
    }
    public int getAge(int age){
        if(age>0){
            this.age = age;
        }return age;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}
