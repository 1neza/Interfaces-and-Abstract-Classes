public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String breed;

    Dog() {
        super();
        breed = "NN";
    }

    public Dog(String name, int age, int weight, String rzad, String breed) {
        super(name, age, weight, rzad);
        this.breed = breed;
    }

    public Dog(int age, String rzad, String breed) {
        super(age, rzad);
        this.breed = breed;
    }

    public void aport(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("The dog is drinking milk.");
    }
    @Override
    public void getVoice() {
        System.out.println("The dog is barking.");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("The dog is eating " + foodName);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " run");
    }
}