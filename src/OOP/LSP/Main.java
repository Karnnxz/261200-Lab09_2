package OOP.LSP;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.move();

        Ostrich ostrich = new Ostrich();
        ostrich.move();

        Sparrow sparrow = new Sparrow();
        sparrow.move();
        sparrow.fly();

        Eagle eagle = new Eagle();
        eagle.move();
        eagle.fly();
    }
}
