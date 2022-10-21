import java.util.*;
import java.util.function.Consumer;

public class Category {
    private ArrayList<Country> countries = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public Country countryList() {

        countries.add(new Country("italy"));
        countries.add(new Country("spain"));
        countries.add(new Country("france"));
        countries.add(new Country("poland"));
        countries.add(new Country("germany"));
        countries.add(new Country("croatia"));
        countries.add(new Country("slovakia"));
        countries.add(new Country("portugal"));
        countries.add(new Country("lithuania"));
        countries.add(new Country("macedonia"));
        countries.add(new Country("montenegro"));
        countries.add(new Country("luxembourg"));
        countries.add(new Country("switzerland"));
        countries.add(new Country("netherlands"));


        Country longestcountry = null;
        Country smallestcountry = null;
        int maxlenhgt = Integer.MIN_VALUE;
        int minlenght = Integer.MAX_VALUE;
        for(Country country : countries) {
            int len = country.getCountry().length();
            if (len > maxlenhgt) {
                maxlenhgt = len;
//                longestcountry = country;
            }
            if (len < minlenght) {
                minlenght = len;
//                smallestcountry = country;
            }
        }

        System.out.println("Max number of letters; " +maxlenhgt);
        System.out.println("Min number of letters "  +minlenght);
        System.out.println("Please choose letter lenght(min - max)");

        ArrayList<Country> lenghtOfWord = new ArrayList<>();
        Country newCountry = null;

//        for (Country country : countries){
//            System.out.println("Please choose letter lenght(min - max)");
//            int input = scanner.nextInt();
//            if(input >=minlenght && input <= maxlenhgt) {
//                int len1 = country.getCountry().length();
//                if (len1 == input ) {
//                    newCountry = country;
//                    lenghtOfWord.add(new Country(newCountry.getCountry()));
//                }
//            }else{
//                System.out.println("Please choose number between man and min ");
//            }
//        }
//        System.out.println(newCountry.getCountry());

        Random random_method = new Random();
        //random index of array
        // loop for generation random number
        for (int i = 0; i < countries.size(); i++) {
            // generating random index with the help of nextInt() method
            int randomCountry = random_method.nextInt(countries.size());
            return countries.get(randomCountry);

        }
        return null;
    }


    private ArrayList<Planet> planets = new ArrayList<>();
    public Planet planetList() {

        planets.add(new Planet("mercury"));
        planets.add(new Planet("venus"));
        planets.add(new Planet("mars"));
        planets.add(new Planet("uranus"));
        planets.add(new Planet("saturn"));
        planets.add(new Planet("earth"));
        planets.add(new Planet("jupiter"));
        planets.add(new Planet("neptune"));

        int maxlenhgt = Integer.MIN_VALUE;
        int minlenght = Integer.MAX_VALUE;

        for(Planet planet : planets) {
            int len = planet.getPlanet().length();
            if (len > maxlenhgt) {
                maxlenhgt = len;

            }
            if (len < minlenght) {
                minlenght = len;

            }
        }
        System.out.println("Max number of letters; " +maxlenhgt);
        System.out.println("Min number of letters "  +minlenght);

        Random random_method2 = new Random();

        // loop for generation random number
        for (int i = 0; i < planets.size(); i++) {
//            int option1 = scanner.nextInt();

            // generating random index with the help of nextInt() method
            int randomPlanet = random_method2.nextInt(planets.size());
            return planets.get(randomPlanet);

        }
        return null;
    }



    private ArrayList<Animal> animal = new ArrayList<>();
    public Animal animalList() {

        animal.add(new Animal("fox"));
        animal.add(new Animal("dog"));
        animal.add(new Animal("goat"));
        animal.add(new Animal("bull"));
        animal.add(new Animal("horse"));
        animal.add(new Animal("zebra"));
        animal.add(new Animal("turtle"));
        animal.add(new Animal("rabbit"));
        animal.add(new Animal("giraffe"));
        animal.add(new Animal("chicken"));
        animal.add(new Animal("elephant"));
        animal.add(new Animal("kangaroo"));
        animal.add(new Animal("butterfly"));
        animal.add(new Animal("crocodile"));
        animal.add(new Animal("chimpanzee"));
        animal.add(new Animal("chinchilla"));
        animal.add(new Animal("hummingbird"));
        animal.add(new Animal("rattlesnake"));

        int maxlenhgt = Integer.MIN_VALUE;
        int minlenght = Integer.MAX_VALUE;

        for(Animal animal1 :animal) {
            int len = animal1.getAnimal().length();
            if (len > maxlenhgt) {
                maxlenhgt = len;

            }
            if (len < minlenght) {
                minlenght = len;

            }
        }
        System.out.println("Max number of letters; " +maxlenhgt);
        System.out.println("Min number of letters "  +minlenght);
        Random random_method3 = new Random();

        // loop for generation random number
        for (int i = 0; i < animal.size(); i++) {
            int length2 = countries.size();
//            System.out.println("Please choose letter lenght");
//            int option2 = scanner.nextInt();
//            if(length2==option2) {
            // generating random index with the help of nextInt() method
            int randomAnimal = random_method3.nextInt(animal.size());
            return animal.get(randomAnimal);
//            }

        }
        return null;
    }
}