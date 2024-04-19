package game.homework;

public class Hare extends Herbivore {
    public Hare() {
        super(20, true);
    }

    @Override
    public void eat() {
        setFullness(true);
        System.out.println("Заяц покушал!");
    }
}
