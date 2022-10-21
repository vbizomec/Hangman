public class Hangman {

    public void printHangman(int badGuessesCount) {
        int poleLines = 6;   // number of lines for hanging pole
        System.out.println("  ____");
        System.out.println("  |  |");
        if (badGuessesCount == 7) {
            System.out.println("  |  |");
            System.out.println("  |  |");
        }
        if (badGuessesCount > 0) {
            System.out.println("  |  O");
            poleLines = 5;
        }
        if (badGuessesCount > 1) {
            poleLines = 4;
            if (badGuessesCount == 2) {
                System.out.println("  |  |");
            } else if (badGuessesCount == 3) {
                System.out.println("  | \\|");
            } else if (badGuessesCount >= 4) {
                System.out.println("  | \\|/");
                System.out.println("  |  |");
            }
            if (badGuessesCount == 5) {
                poleLines = 2;
                System.out.println("  | /");
            } else if (badGuessesCount >= 6) {
                poleLines = 0;
                System.out.println("  | / \\");
            }
            for (int k = 0; k < poleLines; k++) {
                System.out.println("  |");
            }
            System.out.println("__|__");
            System.out.println();
        }
    }
}