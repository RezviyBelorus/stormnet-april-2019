package lec_19_lambda.classwork.part_1.point_3_4;

public class MehodRefMain {
    public static void main(String[] args) {
        Calculator calculator = CalculatorHelper::incrementByOne;

        CalculatorHelper calculatorHelper = new CalculatorHelper();

        Calculator decrement = calculatorHelper::decrementByOne;

        int number = 1;

        System.out.println(calculator.calculate(number));
    }
}

interface Calculator {
    int calculate(int x);
}

class CalculatorHelper {
    static int incrementByOne(int x) {
        return ++x;
    }

    static int sum(int x, int y) {
        return x+y;
    }

    int decrementByOne(int x) {
        return --x;
    }
}