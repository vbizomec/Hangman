import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Play play = new Play();

        do {
            System.out.println("_______LET's PLAY___ ");
            System.out.println("---------------------");
            System.out.println("|        |   ");
            System.out.println("|        0   ");
            System.out.println("|       /|\\ ");
            System.out.println("|        |   ");
            System.out.println("|       / \\ ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
            System.out.println("_____HANGMAN_GAME___\n"+
                    "- Please select number of category -\n");
            System.out.println("1 - Countries in Europe");
            System.out.println("2 - Name of Planet");
            System.out.println("3 - Animal");
            System.out.print("\nPlease select number: ");
            int option = scanner.nextInt();
            if (option == 1) {
                play.playCountry(option);
            }if (option == 2) {
                play.playPlanet(option);
            }if (option == 3) {
                play.playAnimal(option);
            }
        }
        while (true);
    }
}
