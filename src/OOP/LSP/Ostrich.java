package OOP.LSP;

public class Ostrich implements Moveable {
    @Override
    public void move() { // Ostriches cannot fly, so we only implement move ( Polymorphism )
        System.out.println("The ostrich runs swiftly on the ground.");
    }
}
