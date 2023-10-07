package GameArray;

public class HangManDrawing {

    public void hangmanASCII(int wrongTips, int maxNumberOfTips) {

        switch (10 - numberToHangManAccordingTips(maxNumberOfTips) * wrongTips) {
            case 1:
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 2:
                System.out.println("                     -------|");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 3:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 4:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 5:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                     O      |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 6:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                     O      |");
                System.out.println("                    \\       |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 7:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                     O      |");
                System.out.println("                    \\ /     |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 8:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                     O      |");
                System.out.println("                    \\ /     |");
                System.out.println("                     |      |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 9:
                System.out.println("                     -------|");
                System.out.println("                     |      |");
                System.out.println("                     |      |");
                System.out.println("                     O      |");
                System.out.println("                    \\ /     |");
                System.out.println("                     |      |");
                System.out.println("                    /       |");
                System.out.println("                            |");
                System.out.println("                            |");
                System.out.println("                 ===========|");
                break;
            case 10:
                gameOverASCII();
                break;
        }
    }

    public void gameOverASCII() {
        System.out.println();
        System.out.println("                    -------|");
        System.out.println("                    |      |");
        System.out.println("                    |      |");
        System.out.println("                    O      |");
        System.out.println("                   \\ /     |");
        System.out.println("                    |      |");
        System.out.println("                   / \\     |");
        System.out.println("                           |");
        System.out.println("                           |");
        System.out.println("                ===========|");
    }

    private int numberToHangManAccordingTips(int numberOfTips) {
        switch (numberOfTips) {
            case 2:
                return 5;
            case 5:
                return 2;
            case 10:
                return 1;
        }
        return 0;
    }
}
