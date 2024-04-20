package game.homework;

public class Hare extends Animal {
    public Hare() {
        super();
    }

    @Override
    public void eat(GameField food) {
        if (getFullness() >= 100) {
            System.out.println("Hare is already full!");
        }
        if (food instanceof ForestFruit) {
            ((ForestFruit) food).setState(false);
            setFullness(getFullness() + 25);
            System.out.println("Hare ate some fruit");
        }
    }
}
