package lec_19.classwork.part_2.point_3;

import lec_19.classwork.part_1.point_5.User;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<User, String> userToString = (user) -> {
            String name = user.getName();
            String surname = user.getSurname();

            String toString = name + " " + surname;

            return toString;
        };

        User user = new User("Ded", "Mozai");

        String apply = userToString.apply(user);


        System.out.println(apply);
    }
}
