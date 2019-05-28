package lec_13.generic_example;

import java.util.List;

public class WildCard {

    public void show(List<?> list) {
        System.out.println(list);
    }

    public void showIntegers(List<? extends Number> list) {
        System.out.println(list);
    }

    public void showSuperIntegers(List<? super Integer> list) {
        System.out.println(list);
    }
}
