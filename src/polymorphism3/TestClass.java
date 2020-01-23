package polymorphism3;

public class TestClass {
    public static void main(String[] args) {
        HighSchoolStudent student = new HighSchoolStudent("James", 12323, 10);

        Student student2 = new HighSchoolStudent("James", 1323, 11);

        Person student3 = new HighSchoolStudent("Adam", 1232, 10);

        System.out.println(((HighSchoolStudent) student2).getGradeLevel());


        Person[] people = new Person[3];
        people[0] = student;
        people[1] = student2;
        people[2] = student3;

        for(Person p: people){
            p.info();
        }
    }
}
