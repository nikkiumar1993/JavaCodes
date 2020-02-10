package accessModifiers;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;


public class App extends Object {
   private String name;
    private String category;
    private double rating;
    private String description;
    private int size;
    private ArrayList<String> reviews;
    public static int numberOfApps;

    public App(){

   }

    public App(String name, String category, int size){
        this.name = name;
        this.category = category;
        this.size = size;
        numberOfApps++;
        this.reviews =new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
/*Modify method setReview. Method should accept String message.
 Method adds review to the list of reviews if message is at least 3 letters and prints success message.
 If message less than 3 letters then it should NOT add the review and should print failure message.
 */
    public void setReviews( String message) {
        if(message.length()>=3) {
            reviews.add(message);
        }else{
            System.out.println("Your review is not long enough. Message failed.");
        }
    }

    public void open(){
        System.out.println(this.name + " is opening");
    }
    public void close(){
        System.out.println(this.name + " is closing");
    }
    public void update(){
        System.out.println(this.name + " is updating");
    }
    public void info(){
        System.out.println(this.name + " is app name");
        System.out.println(this.category + " is category");
        System.out.println(this.rating + " is the rating");
        System.out.println(this.description + " is the description");
        System.out.println(this.size + " is the size");
        System.out.println(numberOfApps + " is the number of apps");
    }


}
