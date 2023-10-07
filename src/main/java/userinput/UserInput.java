package userinput;

import java.util.Scanner;

public class UserInput {
    public static String userInputValidation(Scanner scanner) {
        String userInput;
        do {
            System.out.println("Please enter a character or a word:");
            userInput = scanner.nextLine();

            if (userInput.length() == 0 || userInput == null) {
                System.out.println("It is an empty  or a null, String please try again.");
                userInput = "";
            }
            if (userInput.matches("[^a-zA-Z]+")) {
                System.out.println("It is not an alphabetic character, please try it again!");
                userInput = "";
            }
        } while (userInput.length() == 0 || userInput.equals(""));
        System.out.println(userInput);
        return userInput.toLowerCase();
    }


    public static int userInputNumberValidation(Scanner scanner) {
        String numberFromUser;
        int menuOptionByUser = 0;
        do {
            System.out.println("Please enter your choice:");
            numberFromUser = scanner.nextLine();
            try {
                menuOptionByUser = Integer.parseInt(numberFromUser);

                if (numberFromUser.matches("[^1-3]")) {
                    System.out.println("It is not a menu option, please try it again!");
                    numberFromUser = "";
                }
            } catch (NumberFormatException e) {
                numberFromUser = "";
            }
        } while (numberFromUser == "");

        return menuOptionByUser;
    }
}
