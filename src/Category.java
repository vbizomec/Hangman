import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Category {
    private ArrayList<Country> countries = new ArrayList<>();

    public Country countryList() {

        countries.add(new Country("slovakia"));
        countries.add(new Country("hungary"));
        countries.add(new Country("poland"));
        countries.add(new Country("germany"));
        countries.add(new Country("croatia"));

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
        planets.add(new Planet("earth"));
        planets.add(new Planet("jupiter"));
        planets.add(new Planet("neptune"));

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

        animal.add(new Animal("horse"));
        animal.add(new Animal("turtle"));
        animal.add(new Animal("kangaroo"));
        animal.add(new Animal("rabbit"));
        animal.add(new Animal("zebra"));

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
