package lec_17.classwork.printstream_example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamExample {
    private static final String PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/classwork/printstream_example/ps.txt";

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(PATH)){
            ps.println("Hello");
            ps.println();
            ps.println("Hello");

            ps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
