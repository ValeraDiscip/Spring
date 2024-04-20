package game.homework;

public class ForestFruit extends GameField {
    private boolean doesExist;

    public ForestFruit() {
        doesExist = true;
    }

    public boolean getState() {
        return doesExist;
    }

    public void setState(boolean newState) {
        this.doesExist = newState;
    }
}
