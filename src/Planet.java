public class Planet {

    private String planet;

    public Planet(String planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planet='" + planet + '\'' +
                '}';
    }

}