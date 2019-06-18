package test;

public interface PrivateDefaultMethod {
    default void show() {
        System.out.println("yo");
    }
}
