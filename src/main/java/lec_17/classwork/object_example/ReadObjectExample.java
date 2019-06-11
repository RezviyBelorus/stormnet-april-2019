package lec_17.classwork.object_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjectExample {
    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/object_example/object";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             ObjectInputStream os = new ObjectInputStream(fis)) {

            Student o = (Student) os.readObject();

            System.out.println(o);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
