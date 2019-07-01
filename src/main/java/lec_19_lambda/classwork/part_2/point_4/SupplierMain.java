package lec_19_lambda.classwork.part_2.point_4;

import lec_19_lambda.classwork.part_1.point_5.User;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<User> userSupplier = () -> {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите имя");
            String name = scanner.next();

            System.out.println("Введите фамилию");
            String surname = scanner.next();

            return new User(name, surname);
        };

        User user = userSupplier.get();

        System.out.println(user);
    }
}
