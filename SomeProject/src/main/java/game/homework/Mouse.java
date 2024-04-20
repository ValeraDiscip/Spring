package game.homework;

public class Mouse extends Animal {
    public Mouse() {
        super();
    }

    @Override
    public void eat(GameField food) {
        if (getFullness() >= 100) {
            System.out.println("Mouse is already full!");
        }
        if (food instanceof ForestFruit) {
            ((ForestFruit) food).setState(false);
            setFullness(getFullness() + 50);
            System.out.println("Mouse ate some fruit");
        }
    }
}

