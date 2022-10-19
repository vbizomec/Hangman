import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class HangmanGame {

        private ArrayList<String> words; //a list of words to pick from
        private char[] wordToGuess; //the target word we're trying to guess
        private char[] wordSoFar; //the word we've guessed so far (starts out as underscores!)
        private ArrayList<Character> alreadyGuessed; //the list of characters we've guessed
        private int totalLives = 5; //total number of lives per game; set in the fields so that it's always the same
        private int lives; //current lives
        private Random gen = new Random(); //a random generator for generating random numbers

        /**
         * Creates a new HangmanGame object--basicaly a wordlist that can be used to start a new game.
         */
        public HangmanGame()
        {


            Random rand = new Random();
            String[] animals = {"Dog", "Cat", "Fish", "Turtle", "Penguin"}; // array of animals
            System.out.println("Console picked " + animals[rand.nextInt(animals.length)]);
            //pick a random word

           /* WordList list = new WordList(); //the list of words
            words = list.getWords(); //put the list in the words ArrayList*/
        }

        /**
         * Creates a new HangmanGame object, with the wordlist containing only the given debugWord. This enables testing of the game using a known word.
         * @param debugWord The single word in the wordlist, used for testing and debugging
         */
        public HangmanGame(String debugWord)
        {
            words = new ArrayList<String>(); //make an empty word ArrayList
            words.add(debugWord); //add just the debugWord
        }

        /**
         * A helper method (that could be private) which re-initializes variables for the start of a new game.
         * Resets the word to guess, the current letters guessed, the number of lives, etc.
         */
        public void setupGame()
        {
            int randIndex = gen.nextInt(words.size()); //pick a random item from teh list
            wordToGuess = words.get(randIndex).toCharArray(); //get that item and convert to a charArray to store
            wordSoFar = new char[wordToGuess.length]; //make the wordSoFar (which has the same length
            for(int i=0; i<wordToGuess.length; i++) //fill with underscores
            {
                wordSoFar[i] = '_';
            }

            alreadyGuessed = new ArrayList<Character>(); //intialize the alreadyGuessed array
            lives = totalLives; //set our lives to our total
        }

        /**
         * A method that plays a complete game of Hangman. Method ends when the game has been either won or lost.
         */
        public void playGame()
        {
            setupGame(); //setup the game when we start playing
            //System.out.println("DEBUG: "+new String(wordToGuess));

            boolean stillPlaying = true;
            while(stillPlaying == true) //loop to keep playing, until we're done
            {
                System.out.println("Computer: " + currentGuessString()); //print the word to guess
                char guessedLetter = getGuess(); //get a
                System.out.println("Player: "+guessedLetter);
                if(!alreadyGuessed.contains(guessedLetter)) //check if we already guessed the letter; could also use a loop to figure out the boolean and then check that
                {
                    alreadyGuessed.add(guessedLetter); //add guess to our alreadyGuesed list!

                    boolean foundLetter = checkGuess(guessedLetter); //see if we had the letter (and already replaces)
                    if(foundLetter == false)
                    {
                        lives = lives -1; //lose a life
                        System.out.println("Computer: I'm sorry, the word has no '"+guessedLetter+"'. You have "+lives+" lives left.");
                    }

                }
                else //otherwise, tell the user they already guessed
                {
                    System.out.println("Computer: You already guessed '"+guessedLetter+"'. Pick another letter.");
                }

                //now that we've guessed the letter...
                if(lives <= 0) //check if we're out of lives
                {
                    System.out.println("No more lives remaining. The word was '"+new String(wordToGuess)+"'.");
                    stillPlaying = false; //we're done playing
                }

                boolean blanksLeft = false;
                for(int i=0; i<wordSoFar.length; i++) //check if we've found all the letters. Lots of ways to do this
                {
                    if(wordSoFar[i] == '_')
                    {
                        blanksLeft = true;
                    }
                }
                if(blanksLeft == false) //see if we had any blanks
                {
                    System.out.println("Congratulations, the word is '"+new String(wordToGuess)+"'! You figured out the word in "+alreadyGuessed.size()+" guesses, and had "+lives+" lives left.");
                    stillPlaying = false; //we're done playing
                }
            }
        }

        /**
         * A helper method (that could be private) that returns a String representation of the current guess state.
         * For example: "g _ e _ _" for the word "guess" if the letters 'g' and 'e' have been guessed.
         *
         * @return A String displaying the current guess of the word. Has the form "g _ e _ _ ".
         */
        public String currentGuessString()
        {
            String toPrint = ""; //the string we will eventually return
            for(int i=0; i<wordSoFar.length; i++)
            {
                toPrint += wordSoFar[i]+" "; //for each letter, add it and a space to the string
            }
            return toPrint;
        }

        //prompts the user for a guess. Converts to lower-case
        /**
         * A helper method (that could be private) that prompts the user to provide a guessed letter. This method converts any guesses into a single, lower-case character.
         *
         * @return a single, lower-case char that the player guessed
         */
        public char getGuess()
        {
            boolean valid = false;
            char c = ' '; //a "blank" value to return (but we'll never return this!)
            while(valid == false) //while we haven't gotten a valid guess...
            {
                String input = JOptionPane.showInputDialog("Guess a letter:");
                c = input.toLowerCase().charAt(0); //make lowercase and get the first character
                if(Character.isLetter(c)) //see if is a letter
                {
                    valid = true;
                }
            }
            return c; //return the letter
        }

        /**
         * A helper method (that could be private) that checks to see if a given letter is present in the target word.
         * If so, all instances of that letter in the target word are revealed.
         *
         * @param letter the letter being guessed
         * @return whether or not the letter was found in the word
         */
        public boolean checkGuess(char letter)
        {
            boolean foundOne = false; //did we find at least one letter?
            for(int i=0; i<wordToGuess.length; i++) //go through the word
            {
                if(letter == wordToGuess[i]) //see if our guessed letter is that char in the word
                {
                    foundOne = true;
                    wordSoFar[i] = letter; //replace the blank with the letter (since we found it!)
                }
            }
            return foundOne; //return whether we found anything or not.
        }

    } //HangmanGame

