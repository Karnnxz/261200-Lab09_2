package OOP.LSP;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("The sparrow hops on the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The sparrow soars through the sky.");
    }
}
