package arrays;

public class ArraysWednesday {
    public static void main(String[] args) {
        String [] carBrands = {"mercedes", "bmw", "toyota", "ferrari"};

        for(String car: carBrands){
            if(car.equalsIgnoreCase("mercedes")){
                System.out.println(car + ": Luxury - comfort");
            }else if(car.equalsIgnoreCase("bmw")) {
                System.out.println(car + ": Luxury - sport");
            }else if(car.equalsIgnoreCase("toyota")) {
                System.out.println(car + ": Reliable - cheap");
            }else if(car.equalsIgnoreCase("ferrari")) {
                System.out.println(car + ": Super Luxury - super fast");
            }else {
                System.out.println("Car not found");
            }
        }
    }
}
