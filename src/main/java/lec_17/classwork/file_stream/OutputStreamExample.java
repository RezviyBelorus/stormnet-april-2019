package lec_17.classwork.file_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamExample {

    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/file_stream/fos.txt";

    public static void main(String[] args) {
//        int[] ints = {1, 2, 23};
//        try (FileWriter fos = new FileWriter(FILE_PATH)) {
//            for (int i = 0; i < ints.length; i++) {
//                fos.write(Integer.toString(ints[i]));
//            }
//
//            fos.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("auth-en-tiсation".equals("auth-en-tication"));
        System.out.println("tiсation".equals("tication"));

        String s1 = "tiсation";
        String s2 = "tication";
        System.out.println("Cycle");
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            char c2 = s2.charAt(i);
            System.out.println(c==c2);
        }
    }
}

