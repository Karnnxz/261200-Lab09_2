package OOP.LSP;

public class Sparrow implements Flyable {
    @Override
    public void move() { // Implementing the move method ( Polymorphism )
        System.out.println("The sparrow hops on the ground.");
    }

    @Override
    public void fly() { // Implementing the fly method ( Polymorphism )
        System.out.println("The sparrow soars through the sky.");
    }
}
