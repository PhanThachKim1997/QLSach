package Controller;

import Model.Author;
import Model.Book;

import Model.Date;
import java.util.Scanner;

public class InputBook {
    public static Book inputBook(){
        //Nhập thông tin tác giả
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        String nameAuthor = sc.nextLine();

        //Nhập ngày sinh tác giả
        Date authorBirthday = new Date();
        System.out.println("Nhập năm sinh tác giả: ");
        authorBirthday.setYear();
        System.out.println("Nhập tháng sinh tác giả: ");
        authorBirthday.setMonth();
        System.out.println("Nhập ngày sinh tác giả: ");
        authorBirthday.setDay();

        //Nhập thông tin sách
        System.out.println("Nhập tên sách: ");
        String nameBook = sc.nextLine();
        System.out.println("Nhập giá tiền sách: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập năm xuất bản: ");
        int yearBook = Integer.parseInt(sc.nextLine());

        //Khởi tạo tác giả và sách
        Author author = new Author(nameAuthor,authorBirthday);
        Book book = new Book(nameBook,price,yearBook,author);

        return book;
    }
    public boolean stopInputbook(String YN){
        return YN.equalsIgnoreCase("Y");
    }
}
