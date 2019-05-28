package lec_13.utils;

public interface GenericInterface<T> {
    void showClass(T input);
    void superShowClass(T input);


    <E> void showClassGenericMethod(E input);
}
