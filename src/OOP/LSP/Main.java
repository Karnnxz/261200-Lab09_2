package OOP.LSP;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin(); // Creating different bird types
        penguin.move(); // Penguin can move without any issues but cannot fly.

        Ostrich ostrich = new Ostrich();
        ostrich.move(); // Ostrich can move without any issues but cannot fly.

        Sparrow sparrow = new Sparrow();
        sparrow.move(); // Sparrow can both move and fly.
        sparrow.fly();

        Eagle eagle = new Eagle();
        eagle.move(); // Eagle can both move and fly.
        eagle.fly();
    }
}
