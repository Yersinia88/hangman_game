package userinput;

public class CheckWord {
    private final String randomWord;
    private String userInput;


    public CheckWord(String randomWord, String userInput) {
        this.randomWord = randomWord;
        this.userInput = userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public boolean checkForWord() {
        if (userInput.equals(randomWord)) {
            System.out.println("Congratulations you are the winner! :)");
            return true;
        }
        return false;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public String getUserInput() {
        return userInput;
    }
}
