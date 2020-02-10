package accessModifiers;

public class Person {
    private String name;
    private String gender;
    private int age;
    private double height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {

            this.gender = gender;
        } else {
            System.out.println("Invalid gender");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>0){
            this.height = height;
        }else{
            System.out.println("Invalid height");
        }

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>0){
            this.weight = weight;
        }else {
            System.out.println("Invalid weight");
        }

    }
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heigth: " + height);
        System.out.println("Weigth: " + weight);
        System.out.println("Gender: " + gender);
    }
}
