import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Category country1 = new Category();
        Category planet1 = new Category();
        Category animal1 = new Category();
        Hangman hangman = new Hangman();

        do {
            System.out.println("\n___WELCOME_TO_HANGMAN_GAME___\n- Please select number of category -\n");
            System.out.println("1 - Countries in Europe");
            System.out.println("2 - Name of Planet");
            System.out.println("3 - Animal");
            System.out.print("\nPlease select one Option [1], [2] or [3]: ");
            int option = scanner.nextInt();

            if (option == 1) {
                String randomWord = country1.countryList().getCountry();
                String underscores = randomWord.replaceAll("[a-zA-Z]", "_");
                System.out.println(underscores);
                StringBuilder hiddenWord = new StringBuilder(underscores);
                ArrayList<Character> charList = new ArrayList<>();
                int wrongCount = 0;
                int guessLimit = 6;
                charList.add('-');
                boolean letterGuess = true;
                Scanner scan = new Scanner(System.in);
                while (!hiddenWord.toString().equals(randomWord) && wrongCount != guessLimit) {
                    System.out.println("Please enter a letter. ");
                    String userInput = scan.nextLine();
                    userInput = userInput.toLowerCase();
                    char a = userInput.charAt(0);
                    if (!charList.contains(a) && Character.isLetter(a)) {
                        for (int i = 0; i < randomWord.length(); i++) {
                            if (randomWord.charAt(i) == a) {
                                hiddenWord.setCharAt(i, a);
                                letterGuess = false;
                            }
                            charList.add(a);
                        }

                        if (letterGuess) {
                            wrongCount++;
                            hangman.printHangman(wrongCount);
                        }
                        letterGuess = true;

                        System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                        System.out.println(hiddenWord);


                    } else if (charList.contains(a)) {
                        System.out.println(" You already entered this letter. Enter a new letter again:");
                    } else if (wrongCount == guessLimit) {
                        System.out.println(" Out of guesses.");
                        System.out.println(" The word is " + randomWord);
                    }
                }
                if (randomWord.equals(hiddenWord.toString())) {
                    System.out.println("You WIN!!! ");
                } else {
                    System.out.println("Sorry You Lost");
                }
            }

                if (option == 2) {
                    String randomWord1 = planet1.planetList().getPlanet();
                    String underscores1 = randomWord1.replaceAll("[a-zA-Z]", "_");
                    System.out.println(underscores1);
                    StringBuilder hiddenWord1 = new StringBuilder(underscores1);
                    ArrayList<Character> charList1 = new ArrayList<>();
                    int wrongCount = 0;
                    int guessLimit = 6;
                    charList1.add('-');
                    boolean letterGuess = true;
                    Scanner scan = new Scanner(System.in);
                    while (!hiddenWord1.toString().equals(randomWord1) && wrongCount != guessLimit) {
                        String userInput = scan.nextLine();
                        userInput = userInput.toLowerCase();
                        char a = userInput.charAt(0);


                        if (!charList1.contains(a) && Character.isLetter(a)) {
                            for (int i = 0; i < randomWord1.length(); i++) {
                                if (randomWord1.charAt(i) == a) {
                                    hiddenWord1.setCharAt(i, a);
                                    letterGuess = false;
                                }
                                charList1.add(a);
                            }
                            if (letterGuess) {
                                wrongCount++;
                                hangman.printHangman(wrongCount);

                            }
                            letterGuess = true;
                            System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                            System.out.println(hiddenWord1);

                        } else if (charList1.contains(a)) {
                            System.out.println(" You already entered this letter. Enter a new letter again:");
                        } else if (wrongCount == guessLimit) {
                            System.out.println(" Out of guesses.");
                            System.out.println(" The word is " + randomWord1);
                        }
                    }
                    if (randomWord1.equals(hiddenWord1.toString())) {
                        System.out.println("You WIN!!! ");
                    } else {
                        System.out.println("Sorry You Lost");
                    }
                }

                if (option == 3) {
                    String randomWord3 = animal1.animalList().getAnimal();
                    String underscores3 = randomWord3.replaceAll("[a-zA-Z]", "_");
                    System.out.println(underscores3);
                    StringBuilder hiddenWord3 = new StringBuilder(underscores3);
                    ArrayList<Character> charList3 = new ArrayList<>();
                    int wrongCount = 0;
                    int guessLimit = 6;
                    charList3.add('-');
                    boolean letterGuess = true;
                    Scanner scan = new Scanner(System.in);
                    while (!hiddenWord3.toString().equals(randomWord3) && wrongCount != guessLimit) {
                        String userInput = scan.nextLine();
                        userInput = userInput.toLowerCase();
                        char a = userInput.charAt(0);

                        if (!charList3.contains(a) && Character.isLetter(a)) {
                            for (int i = 0; i < randomWord3.length(); i++) {
                                if (randomWord3.charAt(i) == a) {
                                    hiddenWord3.setCharAt(i, a);
                                    letterGuess = false;
                                }
                                charList3.add(a);
                            }
                            if (letterGuess) {
                                wrongCount++;
                                hangman.printHangman(wrongCount);
                            }
                            letterGuess = true;
                            System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                            System.out.println(hiddenWord3);

                        } else if (charList3.contains(a)) {
                            System.out.println(" You already entered this letter. Enter a new letter again:");
                        } else if (wrongCount == guessLimit) {
                            System.out.println(" Out of guesses.");
                            System.out.println(" The word is " + randomWord3);
                        }
                    }
                    if (randomWord3.equals(hiddenWord3.toString())) {
                        System.out.println("You WIN!!! ");
                    } else {
                        System.out.println("Sorry You Lost");
                    }
                }
            } while (true);
        }


}
