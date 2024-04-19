package game.homework;

public class Fox extends Predator {
    public Fox() {
        super(15, true);
    }

    public void eatAnotherAnimal(Animal animal) {
        if (animal instanceof Predator) {
            System.out.println("Лиса не может съесть это животное!");
        } else {
            setFullness(true);
            animal.setAlive(false);
            System.out.println("Лиса съела другое животное!");
        }
    }
}
