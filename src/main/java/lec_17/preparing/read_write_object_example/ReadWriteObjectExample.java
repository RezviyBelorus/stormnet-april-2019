package lec_17.preparing.read_write_object_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObjectExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/preparing/read_write_object_example/object");
             FileInputStream fis = new FileInputStream("/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/preparing/read_write_object_example/object");
             ObjectOutputStream ow = new ObjectOutputStream(fos);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = new Student("Egor", 22, new Work("programmer"));

            ow.writeObject(student);
            ow.flush();

            Student importedStudent = (Student) ois.readObject();
            System.out.println(importedStudent);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
