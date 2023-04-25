package Controller;

import Model.Author;
import Model.Book;
import Model.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Controller.InputBook.inputBook;
import static Controller.OutputBook.outputBook;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập và xuất sách
        InputBook inputBook= new InputBook();
        OutputBook outputBook = new OutputBook();
        FindBook findBook = new FindBook();
        ArrayList<Book> books = new ArrayList<>();
        SaleBook saleBook = new SaleBook();
        String YN;
        while(true){
            books.add(inputBook());
            System.out.print("Bạn có muốn nhập thêm sách không? (Y/N): ");
            YN = sc.nextLine();
            if(!inputBook.stopInputbook(YN)){
                break;
            }
        }
        outputBook(books);
        //Tìm kiếm sách theo tên sách, giá tiền, năm SX, tên tác giả.
        System.out.println("Nhập vào keyword để tìm kiếm: ");
        String chuoi = sc.nextLine();
        for(Book book:books){
            if(findBook.findBook(book,chuoi)){
                System.out.println(book);
                System.out.println("-----------");
            }
        }
        System.out.println("Nhập vào stt sách muốn giảm giá: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập % muốn giảm giá: ");
        int rateSale = Integer.parseInt(sc.nextLine());

        Book sales = new Book();
        System.out.println("Giá sách: "+sales.getPrice());
        System.out.println("Giá sách sau khi giảm: "+saleBook.saleBook(sales.getPrice(),rateSale));
    }
}
