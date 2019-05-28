package lec_13.clone_example;

public class HarryPotter implements Cloneable {
    private String name;
    private String year;
    private Author author;


    public HarryPotter(String name, String year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public HarryPotter clone() throws CloneNotSupportedException {
        HarryPotter clone = (HarryPotter) super.clone();
        clone.author = author.clone();

        return clone;
    }

    @Override
    public String toString() {
        return "HarryPotter{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", author=" + author +
                '}';
    }
}
