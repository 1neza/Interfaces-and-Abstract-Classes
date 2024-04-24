public class Mammal extends Animal {
    private String order;

    public Mammal(){
        super();
        order = "NN";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(int age, String order) {
        super(age);
        this.order = order;
    }

    public void drinkMilk(){
        System.out.println("Siup siup");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eat(String foodName){
        System.out.println("Mammal is eating: " + foodName);
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "order='" + order + '\'' +
                '}';
    }
}