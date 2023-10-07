package userinput;
import java.util.Set;

public class CheckCharacters extends CheckWord {
    private String userWord;
    private char[] userSHits;

    public CheckCharacters(String randomWord, String userInput, char[] userSHits) {
        super(randomWord, userInput);
        this.userSHits = userSHits;
        this.userWord = getUserWordFromChars(userSHits);
    }

    public boolean checkForGoal() {
        if (getRandomWord().contains(getUserInput())) {
            int index = getRandomWord().indexOf(getUserInput());
            while (index != -1) {
                char userChar = getUserInput().charAt(0);
                userSHits[index] = userChar;
                index = getRandomWord().indexOf(getUserInput(), index + 1);
            }
            return true;
        }
        return false;
    }

    private String getUserWordFromChars(char[] userSHits) {
        return userSHits.toString();
    }
}

