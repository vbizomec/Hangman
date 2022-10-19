import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.print("\nOption: ");
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
                    String userInput = scan.nextLine();
                    userInput = userInput.toLowerCase();
                    char a = userInput.charAt(0);

                    if (!charList.contains(a)) {
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
                String underscores1 = randomWord1.replaceAll("[a-zA-Z]", "_ ");
                System.out.println(underscores1);
                StringBuilder hiddenWord1 = new StringBuilder(underscores1);
                ArrayList<Character> charList1 = new ArrayList<>();
                int guessCount1 = 0;
                int guessLimit1 = 9;
                Scanner scan1 = new Scanner(System.in);
                while (!hiddenWord1.toString().equals(randomWord1) && guessCount1 != guessLimit1) {
                    String userInput1 = scan1.nextLine();
                    userInput1 = userInput1.toLowerCase();
                    char aa = userInput1.charAt(0);
                    if (!charList1.contains(aa) && guessCount1 != guessLimit1) {
                        for (int i = 0; i < randomWord1.length(); i++) {
                            if (randomWord1.charAt(i) == aa) {
                                hiddenWord1.setCharAt(i, aa);
                            }
                            charList1.add(aa);
                        }
                        System.out.println("You have left  " + (guessLimit1 - guessCount1) + " guesses.");
                        System.out.println(hiddenWord1);
                        guessCount1++;
                    } else if (charList1.contains(aa)) {
                        System.out.println(" You already entered this letter. Enter a new letter again:");
                    } else if (guessCount1 == guessLimit1) {
                        System.out.println(" Out of guesses.");
                        System.out.println(" The word is " + randomWord1);
                    }
                }
            }
            if (option == 3) {
                String randomWord3 = animal1.animalList().getAnimal();
                String underscores3 = randomWord3.replaceAll("[a-zA-Z]", "_ ");
                System.out.println(underscores3);
                StringBuilder hiddenWord2 = new StringBuilder(underscores3);
                ArrayList<Character> charList2 = new ArrayList<>();
                int guessCount3 = 0;
                int guessLimit3 = 6;
                Scanner scan2 = new Scanner(System.in);
                while (!hiddenWord2.toString().equals(randomWord3) && guessCount3 != guessLimit3) {
                    String userInput2 = scan2.nextLine();
                    userInput2 = userInput2.toLowerCase();
                    char aaa = userInput2.charAt(0);
                    if (!charList2.contains(aaa) && guessCount3 != guessLimit3) {
                        for (int i = 0; i < randomWord3.length(); i++) {
                            if (randomWord3.charAt(i) == aaa) {
                                hiddenWord2.setCharAt(i, aaa);
                            }
                            charList2.add(aaa);
                        }
                        System.out.println("You have left  " + (guessLimit3 - guessCount3) + " guesses.");
                        System.out.println(hiddenWord2);
                        guessCount3++;
                    } else if (charList2.contains(aaa)) {
                        System.out.println(" You already entered this letter. Enter a new letter again:");
                    } else if (guessCount3 == guessLimit3) {
                        System.out.println(" Out of guesses.");
                        System.out.println(" The word is " + randomWord3);
                    }
                }
            }
        } while (true);

    }

}

