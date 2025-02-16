// Concrete Duck implementation: Mallard Duck
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack(); // Assigns normal quack behavior
        flyBehaviour = new FlyWithWings(); // Assigns flying with wings
    }
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}