package lec_12;

import java.io.Serializable;

public class AbstractClassImpl extends AbstractClass implements Cloneable, Serializable {
    public AbstractClassImpl() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new AbstractClassImpl();
    }
}
