public class Bird extends Animal {
    private String featherColor;

    Bird(){
        super();
        featherColor = "NN";
    }
    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    public Bird(int age, String featherColor){
        super(age);
        this.featherColor = featherColor;
    }
    public void layEggs(){
        System.out.println("The Bird has laid eggs.");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("The bird eats: " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("The bird makes a sound.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
