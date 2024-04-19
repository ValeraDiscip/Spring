package game.homework;

public class Mouse extends Herbivore {
    public Mouse() {
        super(10, true);
    }

    @Override
    public void eat() {
        setFullness(true);
        System.out.println("Мышка покушала!");
    }
}
