package lec_13.clone_example;

public class BookMain {
    public static void main(String[] args) {
        try {

            SimpleBook animals = new SimpleBook("Animals", 1999, "Darvin");

            SimpleBook copyOfSimpleBook = animals;


            SimpleBook clone = animals.clone();


            System.out.println(animals);
            System.out.println(copyOfSimpleBook);

            animals.setAuthor("I am");

            System.out.println("===Copy simple book");
            System.out.println(copyOfSimpleBook);

            System.out.println("===Clone simple book");
            System.out.println(clone);


            copyOfSimpleBook.setAuthor("Copy author");

            System.out.println("=== Origin animals");
            System.out.println(animals);




        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
