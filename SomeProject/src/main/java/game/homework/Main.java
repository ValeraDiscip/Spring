package game.homework;

public class Main {
    public static void main(String[] args) {
        //Проверяю свой код...
        Bear bear = new Bear();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Mouse mouse = new Mouse();

        Hunter hunter = new Hunter();
        hunter.addBullets(10);

        ForestFruit fruit1 = new ForestFruit();
        ForestFruit fruit2 = new ForestFruit();
        ForestFruit fruit3 = new ForestFruit();

        bear.eat(mouse);


        hare.eat(fruit1);

        hunter.shootAnAnimal(bear);
        hunter.shootAnAnimal(bear);
        hunter.shootAnAnimal(bear);
        hunter.shootAnAnimal(bear);
        //Можно конечно еще добавить статическое поле имя чтобы печаталось понятнее и красивее.
        GameField[] gameField = {hunter, bear, fox, hare, new Mouse(), fruit1, fruit2, fruit3};
    }
}
