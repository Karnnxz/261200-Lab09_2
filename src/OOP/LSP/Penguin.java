package OOP.LSP;

public class Penguin implements Moveable {
    @Override
    public void move() { // Penguins cannot fly, so we only implement move ( Polymorphism )
        System.out.println("The penguin waddles on the ice.");
    }
}
