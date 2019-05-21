package lecture_13.generic_example;

public class GenericExample<T> {
    private T something;

    private int age;
    private T[] array;

    public GenericExample(T something, T[] array) {
        this.something = something;
        this.array = array;
    }

    public T getSomething() {
        return something;
    }

    public void setValue(int index, T value) {
        this.array[index] = value;
    }

    public void showSomething() {
        System.out.println(something.getClass().getName());
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        GenericExample<Integer> genericExample = new GenericExample<>(100, integers);
        genericExample.setValue(0, 33);


        genericExample.showSomething();

        //мы параметризировали класс Integer поэтому метод getSomething() теперь возвращает Integer
        Integer something = genericExample.getSomething();
    }
}
