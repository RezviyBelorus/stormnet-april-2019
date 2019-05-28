package lec_13.generic_example;

public class GenericMethodExample {

    public static <T> void showClassName(T input) {
        System.out.println(input.getClass().getName());
    }

    public static <E, V, D> void showClassName(E input, V input2, D input3) {
        System.out.println(input.getClass().getName());
        System.out.println(input2.getClass().getName());
        System.out.println(input3.getClass().getName());
    }

    public static <E extends Number> void showClassName(E input) {
        System.out.println(input.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodExample.showClassName(100);
        GenericMethodExample.showClassName(100.5);
    }
}
