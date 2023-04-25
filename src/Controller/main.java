package Controller;

import Model.Author;
import Model.Date;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Khởi tạo đối tượng Date và nhập date
        Date date = new Date();
        int day,month,year;
        System.out.print("Nhập năm: ");
        date.setYear();
        System.out.print("Nhập tháng: ");
        date.setMonth();
        System.out.print("Nhập ngày: ");
        while(true){
            date.setDay();
            if(date.checkDay(date.getDay())){
                break;
            }else {
                System.out.println("Lỗi ngày!!! Nhập lại: ");
            }
        }
        System.out.println("--------------------------");
        System.out.println("Nhập tên tác giả");
        String au = sc.nextLine();
        Author author = new Author(au,date);
        System.out.println(author);
    }
}
