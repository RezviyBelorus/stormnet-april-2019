package homework.hw_12.task_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_01 {
    private static final String FILE_PATH = "/mnt/69858667-6c7b-492e-8174-7d5ee0149c3b/alex/IdeaProjects/mesosphere/stormnet-april-2019/src/main/java/homework/hw_12/task_01/text.txt";
    private static final String SPLITTER = " ";
    private static final int WORDS_PER_PARAGRAPH = 3;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {

            List<String> wordsList = new ArrayList<>(30);
            List<String> buffer = new ArrayList<>(WORDS_PER_PARAGRAPH);
            File tempFile = File.createTempFile("tempFile", ".txt");

            try (FileWriter fw = new FileWriter(tempFile)) {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] splittedLineFromFile = line.split(SPLITTER);
                    // перекидываем массив слов в лист, т.к. с ним удобнее работать и мы будем его изменять
                    wordsList.addAll(Arrays.asList(splittedLineFromFile));

                    // мы не увеличиваем i потому что каждый раз удаляем первый элемент, перед этим записав его в буфер
                    for (int i = 0; i < wordsList.size(); ) {

                        if (buffer.size() < WORDS_PER_PARAGRAPH) {
                            String word = wordsList.get(i);
                            //удаляем элемент, т.к. мы его уже вычитали
                            wordsList.remove(i);
                            buffer.add(word);
                        } else {
                            String withoutBracers = prepareStringToWrite(buffer);
                            fw.write(withoutBracers);
                            // новый абзац
                            fw.write("\n");
                            buffer.clear();
                        }
                    }
                }
                // записываем то, что осталось в буфере, кол-во будет нужное или меньше
                String withoutBracers = prepareStringToWrite(buffer);
                fw.write(withoutBracers);

                fw.flush();

                Files.copy(tempFile.toPath(), Paths.get(FILE_PATH), StandardCopyOption.REPLACE_EXISTING);
                tempFile.delete();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String prepareStringToWrite(List<String> linesList) {
        // лист.toString[] -> получится, например, [1,2,3]. Нужно только удалить скобки
        String listAsString = linesList.toString();
        String withoutSquareBrackets = listAsString.substring(1, listAsString.length() - 1);
        return withoutSquareBrackets;
    }
}
