package classes;

public class Student {
    String name;
    String email;
    int age;
     public void read(){
         System.out.println(name + " is reading");
     }
     public void read(int hours){
         System.out.println(name + " is reading for " + hours);
     }
     public void read(Book book){
         System.out.println(name + " is reading " + book.name);
     }
     public Student(String name){
         this.name = name;
     }
}
