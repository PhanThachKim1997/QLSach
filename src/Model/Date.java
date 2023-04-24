package Model;

import java.util.Objects;
import java.util.Scanner;

public class Date {
    int day,month,year;
    Scanner scanner = new Scanner(System.in);

    public Date() {
    }

    public int getDay() {
        return day;
    }

    public void setDay() {
        while (true) {
            try {
                day = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chỉ nhập số nguyên! Nhập lại:");
            }
        }
    }


    public int getMonth() {
        return month;
    }

    public void setMonth() {
        while (true) {
            try {
                month = Integer.parseInt(scanner.nextLine());
                if (month > 0 && month < 13) {
                    this.month = month;
                    break;
                } else {
                    System.out.println("Tháng không hợp lệ! Vui lòng nhập lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chỉ nhập số nguyên! Nhập lại:");
            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        while (true) {
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (year > 0) {
                    this.year = year;
                    break;
                } else {
                    System.out.println("Năm không hợp lệ! Vui lòng nhập lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chỉ nhập số nguyên! Nhập lại:");
            }
        }
    }

    public boolean namNhuan(){
        return ((this.year%4==0&&this.year%100==0&&this.year%400==0)||(this.year%4==0&&this.year%100!=0));
    }

    public boolean checkDay(int day){
        switch (month){
            case 4: case 6: case 9: case 11:
                if(this.day > 0 && this.day < 31)
                    return true;
            case 2:
                if(namNhuan()){
                    return this.day<30&&this.day>0;
                }else return this.day<29&&this.day>0;
            default:
                if(this.day > 0 && this.day < 32)
                    return true;
                else return false;
        }
    }


    @Override
    public String toString() {
        return this.day +" / "+this.month+" / "+this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
