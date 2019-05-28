package lec_13.clone_example;

public class HarryPotterMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Gudini", 1965);
        HarryPotter harryPotter = new HarryPotter("Stone", "2007", author);

        HarryPotter clone = harryPotter.clone();

        System.out.println(harryPotter);
        System.out.println(clone);

        harryPotter.setName("Another name");

        Author author1 = harryPotter.getAuthor();
        author1.setName("Another author name");

        System.out.println("===Clone");
        System.out.println(clone);

    }
}
