package Controller;

import Model.Book;

import java.util.ArrayList;

public class OutputBook {
    public static void outputBook(ArrayList<Book> books){
        for(Book book : books){
            System.out.println(book);
            System.out.println("\n---------------\n");
        }
    }
}
