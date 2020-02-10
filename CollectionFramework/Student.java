package CollectionFramework;

public class Student {
    String name;
    public Student(String name){
        this.name = name;
    }
    public boolean equals(Student s){
        return this.name.equals(s.name);
    }
    public String toString(){
        return String.format("Student name is %s", this.name);
    }
    public static void main(String[] args) {
        Student s = new Student("John");
       Student s2 = new Student("John");
        System.out.println(s);
        System.out.println(s.equals(s2));

    }
}
