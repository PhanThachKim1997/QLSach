package Model;

import java.util.Objects;

public class Author{
    private String nameAuthor;
    private Date date;

    public Author() {
    }

    public Author(String nameAuthor, Date date) {
        this.nameAuthor = nameAuthor;
        this.date = date;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(date, author.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameAuthor, date);
    }

    @Override
    public String toString() {
        return "Author: "+nameAuthor+"\n"+"Birthday: "+date;
    }
}
