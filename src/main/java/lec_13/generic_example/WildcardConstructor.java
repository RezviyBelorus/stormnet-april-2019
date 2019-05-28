package lec_13.generic_example;

public class WildcardConstructor {

    public <T extends Number> WildcardConstructor(T input1, T input2) {
        System.out.println(input1);
        System.out.println(input2);
    }
}
