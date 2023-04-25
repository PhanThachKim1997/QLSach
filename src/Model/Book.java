package Model;

import java.util.Objects;

public class Book extends Author{
    private String nameBook;
    int price, yearBook;
    Author author = new Author();

    public Book() {
    }

    public Book(String nameBook, int price, int yearBook, Author author) {
        this.nameBook = nameBook;
        this.price = price;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return price == book.price && yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameBook, price, yearBook, author);
    }

    @Override
    public String toString() {
        return "Tên sách: "+ nameBook +
                "\nGiá tiền: " + price +
                "\nNăm xuất bản: " + yearBook +
                "\nTác giả: " + author.getNameAuthor();
    }
}
