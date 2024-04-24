public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String species; //gatunek

    Pigeon(){
        super();
        species = "NN";
    }
    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    public Pigeon(int age, String featherColor, String species) {
        super(age, featherColor);
        this.species = species;
    }
    public void transportsMail(){
        System.out.println("Gołąb przenosi poczte");
    }
    @Override
    public void layEggs() {
        System.out.println("Gołąb złożył jajka");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("Gołąb zjadł");
    }
    @Override
    public void getVoice() {
        System.out.println("Gołąb grucha");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " fly");
    }
}