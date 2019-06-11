package lec_17.classwork.object_example;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 4L;

    private String name;
    private String surname;

    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
