public class Fish extends Animal {
    private String scaleColor;

    public Fish(){
        super();
        scaleColor = "NN";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(int age, String scaleColor) {
        super(age);
        this.scaleColor = scaleColor;
    }

    public void swim(){
        System.out.println("The fish is swimming");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("The fish is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("The fish makes a sound.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColor='" + scaleColor + '\'' +
                '}';
    }
}