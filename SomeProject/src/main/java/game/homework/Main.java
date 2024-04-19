package game.homework;

public class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter(10);
        Mouse mouse = new Mouse();
        Hare hare = new Hare();
        Bear bear = new Bear();
        Fox fox = new Fox();

        //А это типа карта на которой находятся все персонажи....Сделал так как понял!
        GameCharacter[] gameField = {hunter, mouse, hare, bear, fox};
        for (GameCharacter gameCharacter : gameField) {
            System.out.println(gameCharacter);
        }


        bear.eatAnotherAnimal(fox);
        System.out.println(fox.getHealth());

        hunter.shootAnAnimal(bear);
        hunter.shootAnAnimal(bear);
        hunter.shootAnAnimal(bear);

        System.out.println(bear.getHealth());
    }
}
