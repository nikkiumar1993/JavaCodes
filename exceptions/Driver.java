package exceptions;

public class Driver {
    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name)throws Exception {
        name.trim();
        if(!name.contains(" ")){
            this.name = name;
        }else{
            throw new Exception(name + " was invalid");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        try{
            driver.setName("Nikki Umarova");
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(driver.getName());
    }

}
