package accessModifiers;


import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "Ikia";

        chair.setSize(15);
        chair.info();
        System.out.println(chair.getSize());

        Person p = new Person();
        p.setAge(-26);
        p.setGender("female");
        p.setHeight(-5.5);
        p.setWeight(-118);
        p.setName("Nikki");
        p.info();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter age: ");
            int age = input.nextInt();
            input.nextLine();
            if (age > 0 && age < 120) {
                p.setAge(age);
                break;

            }
        }
        while (true);


    }

}
