package DesignPatterns;

public class FactoryPattern {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.makeCoffee("Espresso");
        coffee.brew(); // Output: Brewing an Espresso
    }
}

// Step 1: Create an interface for the product (e.g., Coffee)
interface Coffee {
    void brew();
}

// Step 2: Implement concrete classes for each type of Coffee
class Espresso implements Coffee {
    public void brew() {
        System.out.println("Brewing an Espresso");
    }
}

class Latte implements Coffee {
    public void brew() {
        System.out.println("Brewing a Latte");
    }
}

// Step 3: Create a CoffeeFactory with a method to create coffee based on type
class CoffeeFactory {
    public static Coffee makeCoffee(String type) {
        if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else {
            return null;
        }
    }
}


