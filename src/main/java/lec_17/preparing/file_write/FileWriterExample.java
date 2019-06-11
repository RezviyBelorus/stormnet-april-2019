package lec_17.preparing.file_write;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Tratata";

        try (FileOutputStream fos = new FileOutputStream("/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/preparing/big_file.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos, 8192)){
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000_000; i++) {
                bos.write(text.getBytes());

            }

            fos.flush();

            long finish = System.currentTimeMillis();
            System.out.println(finish-start);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
