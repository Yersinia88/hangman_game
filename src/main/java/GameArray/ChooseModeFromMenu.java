package GameArray;

public class ChooseModeFromMenu {

    public static int chooseMode(int number) {
        switch (number) {
            case 1:
                return 10;
            case 2:
                return 5;
            case 3:
                return 2;
        }
        return 0;
    }
}
