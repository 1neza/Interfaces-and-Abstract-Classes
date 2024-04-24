public interface AnimalMove {

    default void move(Object ob){
        System.out.println(ob.getClass().getSimpleName() + "move");
    }
}
