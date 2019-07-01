package lec_19_lambda.classwork.part_1.point_5;

public class LambdaConstructorMain {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;

        User tom = userBuilder.build("Tom", "Dwan");

        System.out.println(tom);
    }
}

interface UserBuilder {
    User build(String name, String surname);
}
