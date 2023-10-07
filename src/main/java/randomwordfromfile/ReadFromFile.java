package randomwordfromfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    private final String name;
    private List<String> wordsFromFile = new ArrayList<>();

    public ReadFromFile(String name) {
        this.name = name;
        wordsFromFileIntoList(name);
    }

    private List<String> wordsFromFileIntoList(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String word;
            while ((word = reader.readLine()) != null) {
                wordsFromFile.add(word);
            }
            return wordsFromFile;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getWordsFromFile() {
        return wordsFromFile;
    }
}
