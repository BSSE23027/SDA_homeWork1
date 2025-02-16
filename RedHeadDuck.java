// Concrete Duck implementation: Red Head Duck
public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehaviour = new Quack(); // Assigns Quack Behaviour
        flyBehaviour = new FlyWithWings(); // Assigns Flying With Wings Behaviour
    }
    public void display(){
        System.out.println("I'm a real Red Head Duck");
    }
}