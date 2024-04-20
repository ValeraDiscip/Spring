package game.homework;

public class Fox extends Animal {

    public Fox() {
        super();
    }

    @Override
    public void eat(GameField food) {
        if (getFullness() >= 100) {
            System.out.println("Fox is already full!");
        }
        if (food instanceof ForestFruit) {
            ((ForestFruit) food).setState(false);
            setFullness(getFullness() + 20);
            System.out.println("Fox ate some fruit!");
        }
        if (food instanceof Hare) {
            ((Hare) food).setAlive(false);
            setFullness(getFullness() + 60);
            System.out.println("Fox ate some hare");
        }
        if (food instanceof Mouse) {
            ((Mouse) food).setAlive(false);
            setFullness(getFullness() + 30);
            System.out.println("Fox ate some mouse");
        }
    }
}
