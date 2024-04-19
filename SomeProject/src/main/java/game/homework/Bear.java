package game.homework;

public class Bear extends Predator {
    public Bear() {
        super(15, true);
    }

    public void eatAnotherAnimal(Animal animal) {
        if (animal instanceof Bear) {
            System.out.println("Медведь медведя не тронет!");
        }
        setFullness(true);
        animal.setAlive(false);
        System.out.println("Медведь съел другое животное!");
    }
}
