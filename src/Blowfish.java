public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    private int diameter;

    public Blowfish(){
        super();
        diameter = 0;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(int age, String scaleColor, int diameter) {
        super(age, scaleColor);
        this.diameter = diameter;
    }

    public void blows(){
        System.out.println("The blowfish pumped up");
    }
    @Override
    public void swim() {
        System.out.println("Blowfish swims");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("Blowfish eats " + foodName);
    }
    @Override
    public void getVoice() {
        System.out.println("Blowfis makes sounds.");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public String toString() {
        return "Blowfish{" +
                "diameter=" + diameter +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " swim");
    }
}