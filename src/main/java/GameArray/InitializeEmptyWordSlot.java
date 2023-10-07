package GameArray;

public class InitializeEmptyWordSlot {
    String word;
    char[] empty;

    public InitializeEmptyWordSlot(String word) {
        this.word = word;
        empty = new char[word.length()];
    }

    public char[] getEmpty() {
        for (int i = 0; i < word.length(); i++) {
            empty[i] = '_';
        }
        return empty;
    }
}
