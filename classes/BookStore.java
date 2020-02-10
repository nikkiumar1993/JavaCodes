package classes;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
//        Book book1 = new Book("automation","cybertek", 100);
//        Book book2 = new Book("OCA", "cybertek", 500);
//        Book book3 = new Book("backend", "cybertek", 300);
//        Book [] myBooks = new Book[3];
//        myBooks[0] = book1;
//        myBooks[1] = book2;
//        myBooks[2] = book3;
//        myBooks[0].pages = 50;
//        for (Book eachBook: myBooks){
//            eachBook.info();
//            //System.out.println(eachBook.name + " has " + eachBook.pages + " pages");
//        }
//        for (int i = 0, j = 50; i < myBooks.length; i++, j+=100) {
//            myBooks[i].pages=j;
//        }
//        for(Book eachBook: myBooks){
//            eachBook.info();
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("How many books do you have?");
        int numOfBooks = input.nextInt();
        input.nextLine();
        Book[] myBooks = new Book[numOfBooks];

        for (int i = 0; i < myBooks.length; i++) {
            System.out.println("Enter books name " + (i + 1));
            String title = input.nextLine();

            System.out.println("Enter the author of book " + (i + 1));
            String author = input.nextLine();

            System.out.println("Enter pages of book " + (i + 1));

            int pages = input.nextInt();
            input.nextLine();
            myBooks[i] = new Book(title, author, pages);
        }
        for(Book book: myBooks){
            System.out.println(book.name);;

        }


    }
}
