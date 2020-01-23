package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student1 {
    String name;
    int age;
    String favHobby;








    public static void main(String[] args) {
        Student1 student = new Student1();
        Scanner scanner = new Scanner(System.in);
        int numOfStudents =  scanner.nextInt();
        Map<Integer, Student1> map = new HashMap<>();

        for (int i = 0; i <numOfStudents ; i++) {
            int id = scanner.nextInt();

            scanner.nextLine();
//            map.put(id, student.name )
        }

    }
}
