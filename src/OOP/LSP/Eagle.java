package OOP.LSP;

public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("The eagle soars through the sky.");
    }

    @Override
    public void fly() {
        System.out.println("The eagle is flying high above the mountains.");
    }
}
