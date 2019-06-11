package lec_17.classwork.buffered_example;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWriterExample {
    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/file_stream/fos.txt";

    public static void main(String[] args) {
        String message = "Hello";
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             BufferedOutputStream bos = new BufferedOutputStream(fos, 2048*2)) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000_000; i++) {
                bos.write(message.getBytes());
                bos.write("\n".getBytes());
            }
            fos.flush();

            long finish = System.currentTimeMillis();

            System.out.println("Result: " + (finish - start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
