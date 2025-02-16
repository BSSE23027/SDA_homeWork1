// Abstract Duck class defining common behaviors
public abstract class Duck {
    FlyBehaviour flyBehaviour; // Composition for FlyBehaviour strategy
    QuackBehaviour quackBehaviour; // Composition for QuackBehaviour strategy

    public Duck() {
    }

    public abstract void display(); // Each duck must define its own display

    public void performFly() {
        flyBehaviour.fly(); // Delegates fly behavior
    }

    public void performQuack() {
        quackBehaviour.quack(); // Delegates quack behavior
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}