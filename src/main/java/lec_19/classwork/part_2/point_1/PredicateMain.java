package lec_19.classwork.part_2.point_1;

import lec_19.classwork.part_1.point_5.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<User> userNamePredicate = (user) -> user.getName().startsWith("A");
        Predicate<User> userSurnamePredicate = (user) -> user.getSurname().startsWith("Зю");

        Predicate<User> userPredicateLong = (user) -> {
            String surname = user.getSurname();
            boolean isStartedWith = surname.startsWith("Зю");

            return isStartedWith;
        };

        List<User> users = new ArrayList<>();
        users.add(new User("Alex", "Зюганов"));
        users.add(new User("Alex", "Павлов"));
        users.add(new User("Alex", "Иванов"));
        users.add(new User("Semen", "Slepakov"));

        System.out.println(users);

        Predicate<User> nameAndSurnamePredicate = userNamePredicate.and(userSurnamePredicate);
        Predicate<User> nameOrSurnamePredicate = userNamePredicate.or(userSurnamePredicate);

        filter(users, nameAndSurnamePredicate);

        System.out.println("== After ==");
        System.out.println(users);


        int x = 0;
        x = inc(x);

        System.out.println("x=" + x);
    }

    private static List<User> filter(List<User> users, Predicate<User> predicate) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (predicate.test(user)) {
                iterator.remove();
            }
        }

        return users;
    }

    private static int inc(int x) {
        return ++x;
    }
}
