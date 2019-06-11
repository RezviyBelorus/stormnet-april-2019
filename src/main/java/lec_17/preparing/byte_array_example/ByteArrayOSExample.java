package lec_17.preparing.byte_array_example;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOSExample {
    public static void main(String[] args) throws IOException {
        String s = "Hello";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(s.getBytes());

        byteArrayOutputStream.writeTo(new FileOutputStream("/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/lec_17/preparing/test.txt", true));

        byte[] bytes1 = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(s.getBytes()));



        int[] intArray = new int[]{1, 2, 3, 6, Integer.MAX_VALUE};

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            for (int b : intArray) {
                baos.write(b);
            }
            baos.flush();

            byte[] bytes = baos.toByteArray();

            System.out.println(Arrays.toString(bytes));

            System.out.println((long)Integer.MAX_VALUE+Integer.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
