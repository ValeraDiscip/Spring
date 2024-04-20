package game.homework;

public class Hunter extends GameField {
    private int countOfBullets;

    public Hunter() {
        super();
    }

    public Hunter(int countOfBullets) {
        this.countOfBullets = countOfBullets;
    }

    public int getCountOfBullets() {
        return countOfBullets;
    }

    public void setCountOfBullets(int countOfBullets) {
        this.countOfBullets = countOfBullets;
    }

    public void shootAnAnimal(Animal animal) {
        if (countOfBullets == 0) {
            System.out.println("Недостаточно патронов!");
        } else {
            animal.setHealth(animal.getHealth() - 15);
            if (animal.isAlive()) {
                System.out.println("The animal is injured! It's health = " + animal.getHealth());
            } else {
                System.out.println("The animal is died!");
            }
        }
    }

    public void addBullets(int countOfBullets) {
        setCountOfBullets(getCountOfBullets() + countOfBullets);
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "countOfBullets=" + countOfBullets +
                '}';
    }
}
