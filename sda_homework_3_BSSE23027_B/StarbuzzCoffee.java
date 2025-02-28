public abstract class Beverage{
    String description;
    public Beverage(){
        description = "Unknown Beverage";
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

public abstract class condimentDecorator extends Beverage{
    public abstract String getDescription();
}

public class Espresso extends Beverage{
    public Espresso (){
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
}

public class HouseBlend extends Beverage{
    public HouseBlend (){
        description = "House Blend Coffee";
    }
    public double cost(){
        return .89;
    }
}

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "DarkRoast";
    }
    public double cost(){
        return .99;
    }
}

public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }
    public double cost(){
        return 1.05;
    }
}

public class Mocha extends condimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }
    public double cost(){
        return .20 + beverage.cost();
    }
}

public class Whip extends condimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }
    public double cost(){
        return .10 + beverage.cost();
    }
}

public class Soy extends condimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }
    public double cost(){
        return .15 + beverage.cost();
    }
}

public class SteamedMilk extends condimentDecorator{
    Beverage beverage;
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Steamed Milk";
    }
    public double cost(){
        return .10 + beverage.cost();
    }
}


public class StarbuzzCoffee{
    public static void main (String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  $" + beverage.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "  $" + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "  $" + beverage3.cost());
        
    }
}

