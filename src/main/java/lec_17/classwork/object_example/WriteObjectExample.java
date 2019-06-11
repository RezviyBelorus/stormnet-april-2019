package lec_17.classwork.object_example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectExample {
    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/object_example/object";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream os = new ObjectOutputStream(fos)) {

            Student student = new Student("Igor", "Ivanov", 22);

            os.writeObject(student);
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
