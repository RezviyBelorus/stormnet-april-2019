package lecture_13.utils;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    @Override
    public void showClass(T input) {
        System.out.println(input.getClass().getName());
    }

    @Override
    public void superShowClass(T input) {
    //put here your implementation
    }

    @Override
    public <E> void showClassGenericMethod(E input) {
        System.out.println(input.getClass().getName());
    }
}
