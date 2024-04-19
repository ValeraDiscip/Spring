package game.homework;

public class Hunter extends GameCharacter {
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
        }
        if (animal.getHealth() - 10 <= 0) {
            animal.setAlive(false);
            System.out.println("Животное убито!");
            countOfBullets--;
        } else {
            animal.setHealth(animal.getHealth() - 10);
            System.out.println("Животное ранено!");
            countOfBullets--;
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
