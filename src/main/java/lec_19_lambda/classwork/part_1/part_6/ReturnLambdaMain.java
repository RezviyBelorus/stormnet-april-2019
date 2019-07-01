package lec_19_lambda.classwork.part_1.part_6;

public class ReturnLambdaMain {
    public static void main(String[] args) {
        UniqueCalculator uniqueCalculator = getUniqueCalculator(4);

        int number_1 = 100;
        int number_2 = 2;

        int result = uniqueCalculator.execute(number_1, number_2);

        System.out.println(result);
    }

    private static UniqueCalculator getUniqueCalculator(int number) {
        UniqueCalculator uniqueCalculator;

        switch (number) {
            case 1:
                uniqueCalculator = (x, y) -> x + y;
                break;
            case 2:
                uniqueCalculator = (x, y) -> x - y;
            case 3:
                uniqueCalculator = (x, y) -> x * y;
            default:
                uniqueCalculator = (x, y) -> x / y;
        }
        return uniqueCalculator;
    }
}

interface UniqueCalculator {
    int execute(int x, int y);
}
