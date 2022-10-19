import java.sql.SQLOutput;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Category country1 = new Category();
        System.out.println(country1.countryList().getCountry());

        Category planet1 = new Category();
        System.out.println(planet1.planetList().getPlanet());

        Category animal1 = new Category();
        System.out.println(animal1.animalList().getAnimal());


        do {

            System.out.println("\n___WELCOME_TO_HANGMAN_GAME___\n- Please select number of category -\n");
            System.out.println("1 - Countries in Europe");
            System.out.println("2 - Name of Planet");
            System.out.println("3 - Animal");
            System.out.print("\nOption: ");
            int option = scanner.nextInt();

            if (option == 1) {
                String word = country1.countryList().getCountry();
                String underscores = word.replaceAll("[a-zA-Z]", "_ ");
                System.out.println(underscores);


            } else if (option == 2) {
                String word = planet1.planetList().getPlanet();
                String underscores = word.replaceAll("[a-zA-Z]", "_ " );
                System.out.println(underscores);

            } else if (option == 3) {
                String word =  animal1.animalList().getAnimal();
                String underscores = word.replaceAll("[a-zA-Z]", "_ ");
                System.out.println(underscores);
                break;
            }
        } while (true);
    }
}







