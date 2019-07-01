package lec_19_lambda.classwork.part_2.point_5_6;

import lec_19_lambda.classwork.part_1.point_5.User;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryMain {
    public static void main(String[] args) {
        UnaryOperator<User> unaryOperator = (user) -> {
            String name = user.getName();
            name = name.toUpperCase();
            user.setName(name);

            return user;
        };

        User dedMoroz = new User("Ded", "Moroz");

        System.out.println(dedMoroz);

        unaryOperator.apply(dedMoroz);

        System.out.println("== After apply() ==");
        System.out.println(dedMoroz);


        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

        int num_1 = 99;
        int num_2 = 1;

        Integer sum = binaryOperator.apply(num_1, num_2);
        System.out.println("Sum = " + sum);
    }
}
