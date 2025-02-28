Overview
The design is based on the classic Decorator Pattern, where:

Component: The abstract Beverage class serves as the base component. It defines the core attributes and behaviors (i.e., description and the cost() method) for all beverages.
Concrete Components: Classes such as Espresso, HouseBlend, DarkRoast, and Decaf extend Beverage and implement the cost() method while setting their unique descriptions.
Decorator: The abstract class condimentDecorator extends Beverage and forces its subclasses to implement the getDescription() method, ensuring that all decorators add their specific details to the beverage description.
Concrete Decorators: Classes like Mocha, Whip, Soy, and SteamedMilk extend condimentDecorator. Each of these classes holds a reference to a Beverage object and augments its description and cost.
Execution Steps
Initialization of Beverages:
The application begins by creating instances of concrete Beverage classes. For example:

An Espresso is created, which sets its description to "Espresso" and defines its cost as $1.99.
Dynamic Decoration:
Beverages are then decorated by wrapping them with one or more condiment decorators. For instance:

A DarkRoast is wrapped first with a Mocha decorator, then again with another Mocha, and finally with a Whip decorator.
Each decorator calls the getDescription() method of the beverage it wraps and appends its own condiment description (e.g., ", Mocha", ", Whip").
Similarly, the cost is calculated by adding the cost of the decorator (e.g., .20 for Mocha) to the cost of the wrapped beverage.
Printing the Final Beverage:
The final descriptions and costs are computed dynamically as the decorators are applied. The application prints out the full description and final cost of each beverage:

For example, the output might be:
Espresso $1.99
DarkRoast, Mocha, Mocha, Whip $1.49 (the final cost being the sum of the base cost and the additional condiment costs)
House Blend Coffee, Soy, Mocha, Whip $1.14
How the Decorator Pattern is Dynamically Implemented
Wrapping and Extensibility:
Each condiment decorator (e.g., Mocha, Whip) takes a Beverage object as a parameter in its constructor. This allows decorators to wrap other beverages (or even other decorators), effectively creating a layered stack of modifications.

Dynamic Composition:
The final beverage object is constructed by successive wrapping. This means that condiments can be added, removed, or reordered at runtime without altering the base beverage classes. This dynamic composition makes it easy to extend functionality without modifying existing code.

Separation of Concerns:
The base beverage classes focus on the core beverage functionality, while each decorator encapsulates the additional behavior (i.e., condiment-specific description and cost modifications). This separation simplifies maintenance and enhances scalability.

Benefits of Using the Decorator Pattern in This Example
Flexibility:
The pattern allows you to mix and match condiments without creating a new subclass for every possible combination. You can easily add new condiment types without modifying the beverage classes.

Enhanced Readability and Maintainability:
Each class has a single responsibility. Base beverage classes handle the core beverage logic, while decorators manage individual enhancements. This clear separation makes the code easier to understand and maintain.

Dynamic Behavior:
Decorators are applied at runtime, providing dynamic modifications to an object’s behavior. This means that the system can accommodate varying configurations and enhancements on the fly.

Open/Closed Principle:
The design adheres to the Open/Closed Principle by being open to extension (adding new decorators) while being closed to modification (base classes remain unchanged). This improves overall code stability and robustness.

Running the Application
Compile the Java Files:
Ensure all Java files are in the same directory and compile them using:

	javac *.java

Run the Main Class:
Execute the main class (StarbuzzCoffee) to see the output:

	java StarbuzzCoffee

The console will display the detailed beverage descriptions along with their final calculated costs.