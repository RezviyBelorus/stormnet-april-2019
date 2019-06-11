package lec_17.preparing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world!!!";

        try (PrintStream ps = new PrintStream("/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/preparing/test.txt")) {
            ps.println(s1);
            ps.write(s2.getBytes());
            ps.println(s2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
