package Controller;

public class SaleBook {
    public SaleBook() {
    }

    public double saleBook(int price, double giam){

        return price-(price*giam/100);
    }
}
