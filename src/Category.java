import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Category {
    private ArrayList<Country> countries = new ArrayList<>();

    public Country countryList() {

        countries.add(new Country("Slovakia"));
        countries.add(new Country("Hungary"));
        countries.add(new Country("Poland"));
        countries.add(new Country("Germany"));
        countries.add(new Country("Croatia"));

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

        planets.add(new Planet("Mercury"));
        planets.add(new Planet("Venus"));
        planets.add(new Planet("Earth"));
        planets.add(new Planet("Jupiter"));
        planets.add(new Planet("Neptune"));

        Random random_method2 = new Random();

        // loop for generation random number
        for (int i = 0; i < planets.size(); i++) {
            // generating random index with the help of nextInt() method
            int randomPlanet = random_method2.nextInt(planets.size());
            return planets.get(randomPlanet);
        }
        return null;
    }



    private ArrayList<Animal> animal = new ArrayList<>();
    public Animal animalList() {

        animal.add(new Animal("Horse"));
        animal.add(new Animal("Turtle"));
        animal.add(new Animal("Kangaroo"));
        animal.add(new Animal("Rabbit"));
        animal.add(new Animal("Zebra"));

        Random random_method3 = new Random();

        // loop for generation random number
        for (int i = 0; i < animal.size(); i++) {
            // generating random index with the help of nextInt() method
            int randomAnimal = random_method3.nextInt(animal.size());

            return animal.get(randomAnimal);

        }
        return null;
    }
}
