package randomwordfromfile;

import java.util.List;
import java.util.Random;

public class RandomWord {
    Random random = new Random();

    private final String fileName;

    public RandomWord(String fileName) {
        this.fileName = fileName;
    }

    public String getRandomWord() {
        ReadFromFile readFromFile = new ReadFromFile(fileName);
        List<String> listOfWordsFromFile = readFromFile.getWordsFromFile();
        int index = random.nextInt(0, listOfWordsFromFile.size());

        return listOfWordsFromFile.get(index).toLowerCase();
    }

}
