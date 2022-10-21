import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Play {
    Category country1 = new Category();

    Category planet1 = new Category();

    Category animal1 = new Category();
    Hangman hangman = new Hangman();

    public void playCountry(int playGuestCountry) {

        play(country1.countryList().getCountry());
    }
    public void playPlanet(int playGuestPlanet) {
        play(planet1.planetList().getPlanet());
    }
    public void playAnimal(int playGuestAnimal) {
        play(animal1.animalList().getAnimal());
    }
    public void play(String randomWord) {
        String underscores = randomWord.replaceAll("[a-zA-Z]", "_");
        for (int i = 0; i < underscores.length(); i++) {
            System.out.print(underscores.charAt(i) + " ");
        }
        System.out.println();
        System.out.println();
        StringBuilder hiddenWord = new StringBuilder(underscores);
        ArrayList<Character> charList = new ArrayList<>();
        int wrongCount = 0;
        int guessLimit = 6;
        boolean letterGuess = true;
        Scanner scan = new Scanner(System.in);
        while (!hiddenWord.toString().equals(randomWord) && wrongCount != guessLimit) {
            Collections.sort(charList);
            System.out.println("\nLetters already entered: " + charList);
            System.out.println("Please enter a letter. ");
            String userInput = scan.nextLine();
            if(userInput.isEmpty()){
                System.out.println("You press Enter please press letter: ");
            }else{
                userInput = userInput.toLowerCase();
                char a = userInput.charAt(0);
                if (!charList.contains(a) && Character.isLetter(a)) {
                    charList.add(a);
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (randomWord.charAt(i) == a) {
                            hiddenWord.setCharAt(i, a);
                            letterGuess = false;
                        }
                    }
                    if (letterGuess) {
                        wrongCount++;
                        hangman.printHangman(wrongCount);
                    }
                    letterGuess = true;
                    System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                    for (int i = 0; i < underscores.length(); i++) {
                        System.out.print(hiddenWord.charAt(i) + " ");
                    }
                } else if (charList.contains(a)) {
                    System.out.println(" You already entered this letter. Enter a new letter again:");
                } else if (wrongCount == guessLimit) {
                    System.out.println(" Out of guesses.");
                }
            }
        }
        if (randomWord.equals(hiddenWord.toString())) {
            System.out.println("\n******You WIN!!!*********** \n");
        } else {
            System.out.println("\n  Sorry You Lost  \nGuessing word was >>" + randomWord.toUpperCase() + "<<");
        }
    }
}