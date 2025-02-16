import java.util.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Creating a MallardDuck instance
        Duck mallard = new MallardDuck();
        System.out.println("\nInitial behavior of MallardDuck:");
        mallard.display();
        mallard.performQuack(); // Quack
        mallard.performFly();   // Flying with wings

        // Creating a RubberDuck instance
        Duck rubberDuck = new RubberDuck();
        System.out.println("\nInitial behavior of RubberDuck:");
        rubberDuck.display();
        rubberDuck.performQuack(); // Squeak
        rubberDuck.performFly();   // Cannot fly

        // Demonstrating strategy switching at runtime
        System.out.println("\nChanging RubberDuck's quack behavior to MuteQuack...");
        rubberDuck.quackBehaviour = new MuteQuack(); // Changing quack behavior dynamically
        rubberDuck.performQuack(); // Now it should be silent

        System.out.println("\nChanging RubberDuck's fly behavior to FlyWithWings...");
        rubberDuck.flyBehaviour = new FlyWithWings(); // Changing fly behavior dynamically
        rubberDuck.performFly(); // Now it can fly
    }
}