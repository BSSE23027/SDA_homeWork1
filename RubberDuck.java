// Concrete Duck implementation: Rubber Duck
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak(); // Assigns squeak behavior
        flyBehaviour = new FlyNoWay(); // Assigns no flying behavior
    }
    public void display() {
        System.out.println("I'm a real Rubber Duck");
    }
}