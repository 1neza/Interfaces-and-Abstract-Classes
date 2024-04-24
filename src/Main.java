public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        // animal[0] = new Animal();
        animal[0] = new Mammal("Little brown", 2,2,"Bat");
        animal[1] = new Dog("Butkus", 5,15,"Carnivora", "Mastiff");
        animal[2] = new Bird("Platypus", 2,1,"White");
        animal[3] = new Pigeon("Pablo", 10,1,"Grey", "spain");
        animal[4] = new Fish("Nemo", 1,3,"Mixed");
        animal[5] = new Blowfish("Blowfish", 5,2,"gray",10);
//
//        animal[1].getVoice();
//        animal[2].getVoice();

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Butkus", 5,15,"Carnivora", "Mastiff");
        animalBehavior[1] = new Pigeon("Pablo", 10,1,"Grey", "spain");
        animalBehavior[2] = new Blowfish("Blowfish", 5,2,"gray",10);

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        //foreach loop
        for (Animal a : animal) {
            a.move(a);
        }

        for (Animal a : animal) {
            AnimalName.name(a.getName());
        }
    }
}