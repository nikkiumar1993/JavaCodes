package polymorphism3;



public class Person {

    private String name;
    public Person(String name){
        setName(name);
    }

    public void info(){
        System.out.println("Name: "+ this.name);
    }
    public boolean hasSameName(Person otherPerson){
        if(otherPerson.name.equalsIgnoreCase(this.getName())){
            return true;
        }return false;

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



}
