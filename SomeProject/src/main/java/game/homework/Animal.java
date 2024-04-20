package game.homework;

public abstract class Animal extends GameField {
    private int fullness;
    private int health;
    private boolean isAlive;

    public Animal() {
        this.fullness = 0;
        this.health = 100;
        this.isAlive = true;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            isAlive = false;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
        if (!alive) {
            health = 0;
        }
    }

    public abstract void eat(GameField food);

    @Override
    public String toString() {
        return "Animal{" +
                "fullness=" + fullness +
                ", health=" + health +
                ", isAlive=" + isAlive +
                '}';
    }
}
