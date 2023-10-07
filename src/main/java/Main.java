import GameArray.ChooseModeFromMenu;
import GameArray.HangManDrawing;
import GameArray.InitializeEmptyWordSlot;
import GameArray.Menu;
import randomwordfromfile.RandomWord;
import userinput.CheckCharacters;
import userinput.CheckWord;
import userinput.UserInput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        try (SCANNER) {
            Menu.menu();
            int maxNumberOfTips = ChooseModeFromMenu.chooseMode(UserInput.userInputNumberValidation(SCANNER));
            int wrongTips = maxNumberOfTips;
            String fileName = "hangman_words.txt";

            String randomWord = getRandomWord(fileName);
            System.out.println(randomWord);
            char[] userSHits = getEmptySlots(randomWord);
            System.out.println(userSHits);

            Set<Character> userTips = new HashSet<>();

            boolean out = false;

            do {
                String userinput = UserInput.userInputValidation(SCANNER);
                if (userinput.length() == 1) {
                    char userinputOnlyOneCharacter = userinput.charAt(0);
                    CheckCharacters checkCharacters = new CheckCharacters(randomWord, userinput, userSHits);
                    if (checkCharacters.checkForGoal()) {
                        if(!userTips.add(userinputOnlyOneCharacter)){
                            System.out.printf("You have already tried this character, you have only %d tip has left%n", --wrongTips);
                        }
                    } else {
                        if (!userTips.add(userinputOnlyOneCharacter) && wrongTips != 0) {
                            System.out.printf("You have already tried this character, you have only %d tip has left%n", --wrongTips);
                        }
                        wrongTips--;
                        if (wrongTips == 0) {
                            System.out.printf("Sorry you are out of your %d tips.%n", maxNumberOfTips);
                            System.out.println("Bye-bye");
                            out = true;
                        }
                    }
                    if (new CheckWord(String.valueOf(userSHits), randomWord).checkForWord()) {
                        out = true;
                    }
                } else if (userinput.length() > 1) {
                    if (new CheckWord(userinput, randomWord).checkForWord()) {
                        out = true;
                    } else {
                        System.out.printf("Sorry, you are lost, the randomWord was %s and not %s.%nBye-bye", randomWord, userinput);
                        new HangManDrawing().gameOverASCII();
                        out = true;
                    }
                }
                new HangManDrawing().hangmanASCII(wrongTips, maxNumberOfTips);
            } while (!out);
        }
    }

    private static char[] getEmptySlots(String randomWord) {
        InitializeEmptyWordSlot userWord = new InitializeEmptyWordSlot(randomWord);
        char[] userSHits = userWord.getEmpty();
        return userSHits;
    }

    private static String getRandomWord(String fileName) {
        RandomWord word = new RandomWord(fileName);
        String randomWord = word.getRandomWord();
        return randomWord;
    }
}
