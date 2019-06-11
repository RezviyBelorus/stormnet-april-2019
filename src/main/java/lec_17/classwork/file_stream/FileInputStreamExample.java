package lec_17.classwork.file_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/file_stream/fos.txt";

    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream(FILE_PATH);
            int i;
//            String[] strings = new String[is.available()];
            while ((i = is.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (InputStream fis = new FileInputStream(FILE_PATH)) {
            int i;

            while ((i = fis.read()) != -1) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
