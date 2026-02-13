package OOP.LSP;

public class Eagle implements Flyable {
    @Override
    public void move() { // Implementing the move method ( Polymorphism )
        System.out.println("The eagle soars through the sky.");
    }

    @Override
    public void fly() { // Implementing the fly method ( Polymorphism )
        System.out.println("The eagle is flying high above the mountains.");
    }
}
