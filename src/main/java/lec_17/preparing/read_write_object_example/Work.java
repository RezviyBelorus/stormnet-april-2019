package lec_17.preparing.read_write_object_example;

import java.io.Serializable;

public class Work implements Serializable {
    private String name;

    public Work(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                '}';
    }
}
