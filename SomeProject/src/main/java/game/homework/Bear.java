package game.homework;

public class Bear extends Animal {
    public Bear() {
        super();
    }

    @Override
    public void eat(GameField food) {
        if (getFullness() >= 100) {
            System.out.println("Bear is already full!");
        }
        if (food instanceof ForestFruit) {
            ((ForestFruit) food).setState(false);
            setFullness(getFullness() + 10);
            System.out.println("Bear ate some fruit!");
        }

        if (food instanceof Mouse) {
            ((Mouse) food).setAlive(false);
            setFullness(getFullness() + 30);
            System.out.println("Bear ate some mouse");
        }
    }
}
