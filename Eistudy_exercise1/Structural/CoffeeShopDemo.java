interface Coffee {
    int cost();
}

class SimpleCoffee implements Coffee {
    @Override
    public int cost() {
        return 5;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public int cost() {
        return decoratedCoffee.cost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

// Usage
class CoffeeShopDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        Coffee milkCoffee = new MilkDecorator(coffee);
        Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Coffee cost: $" + sweetMilkCoffee.cost());
    }
}