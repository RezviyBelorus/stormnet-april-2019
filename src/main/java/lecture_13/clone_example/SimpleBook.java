package lecture_13.clone_example;

public class SimpleBook implements Cloneable{
    private String bookName;
    private int year;
    private String author;


    public SimpleBook(String bookName, int year, String author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SimpleBook{" +
                "bookName='" + bookName + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public SimpleBook clone() throws CloneNotSupportedException {
        return (SimpleBook) super.clone();
    }
}
