package lec_19.classwork.part_2.point_2;

import lec_19.classwork.part_1.point_5.User;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<User> print = (user) -> {
            System.out.println("User name = " + user.getName());
            System.out.println("User surname = " + user.getSurname());
        };


        User user = new User("Egor", "Pavlov");
        print.accept(user);

        System.out.println("== Print twice (andThen()) ==");
        Consumer<User> printTwice = print.andThen(print);
        printTwice.accept(user);
    }
}
