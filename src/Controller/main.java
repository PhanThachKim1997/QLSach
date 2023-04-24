package Controller;

import Model.Date;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                System.out.println(date);
                break;
            }else {
                System.out.println("Lỗi ngày!!! Nhập lại: ");
            }
        }
    }
}
