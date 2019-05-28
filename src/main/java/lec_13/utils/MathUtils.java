package lec_13.utils;

public class MathUtils {

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        Number[] integers = {1, 3, 3};
        String[] strings = new String[]{"1", "0"};

        double sum = MathUtils.sum(integers);

// ошибка компиляции, в метод можно передавать только Numbers
//        double sumOfStrings = MathUtils.sum(strings);

        System.out.println(sum);
    }
}
