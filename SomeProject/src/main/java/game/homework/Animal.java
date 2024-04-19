package game.homework;

public abstract class Animal extends GameCharacter {
    private boolean fullness;
    private int health;
    private int speed;
    private boolean isAlive;

    public Animal() {
    }

    public Animal(int speed, boolean isAlive) {
        this.fullness = false;
        this.health = 100;
        this.speed = speed;
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
        if (!alive) {
            setHealth(0);
        }
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "fullness=" + fullness +
                ", health=" + health +
                ", speed=" + speed +
                ", isAlive=" + isAlive +
                '}';
    }
}
