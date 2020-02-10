package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        String[] books = {"Java", "Twilight", "Harry Potter", "Last Song", "Leaders eat last"};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book you want to replace");
        String userBook = input.nextLine();
        int index = Arrays.binarySearch(books, userBook);


            if(index >= 0){
                System.out.println("What book will you replace " + userBook + " with");
                String newBook = input.nextLine();
                books[index] = newBook;
            }else{
                System.out.println("Book not found");
        }
        System.out.println(Arrays.toString(books));
    }
}
