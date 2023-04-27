package Controller;

import Model.Book;

import java.util.ArrayList;

public class FindBook {

    public boolean checkNumber(String check){
        int kiemtra;
        try{
            kiemtra = Integer.parseInt(check);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public boolean findBook(Book book, String chuoi){
            if(checkNumber(chuoi)){
                int yearBook = Integer.parseInt(chuoi);
                int priceBook = Integer.parseInt(chuoi);

                if(book.getYearBook() == yearBook){
                    return true;
                }
                if(book.getPrice() == priceBook){
                    return true;
                }
            }else {
                if(book.getNameBook().equals(chuoi)){
                    return true;
                }else if(book.getAuthor().getNameAuthor().equals(chuoi)){
                    return true;
                }
            }
        return false;
    }
}
