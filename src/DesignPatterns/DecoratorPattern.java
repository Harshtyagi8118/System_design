package DesignPatterns;

import javax.swing.plaf.SplitPaneUI;

public class DecoratorPattern {
    public static void main(String[] args){
        Pizza pizza = new BasePizza();
        pizza = new PaneerPizzaDecorator(pizza);
        System.out.println("Description : "+ pizza.getDescription());
        System.out.println("Amount : $"+pizza.getAmount());
        pizza = new ChickenPizzaDecorator(pizza);
        System.out.println("Description : "+ pizza.getDescription());
        System.out.println("Amount : $"+pizza.getAmount());
        pizza = new ChickenPizzaDecorator(pizza);
        System.out.println("Description : "+ pizza.getDescription());
        System.out.println("Amount : $"+pizza.getAmount());


    }
}

/*     KeyConcepts

       Component Interface ->  Defines the core functionality
       Concrete component -> The main object we want to decorate which serve as a base class

       Decorator -> the abstract class or interface that wrap around the component and adds extra functionality
       Concrete Decorator -> Classes which extend the decorator to add specific features, like adding milk or sugar.

 */
//Component interface
interface Pizza{
    String getDescription();
    int getAmount();
}
//Concrete Component
class BasePizza implements Pizza{

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public int getAmount() {
        return 10;
    }
}
// Decorator
// making it abstract as it will serve as base for all the pizza
 abstract class PizzaDecorator implements Pizza{

     protected Pizza pizza;
     public PizzaDecorator(Pizza pizza){
         this.pizza = pizza;
     }

     @Override
     public String getDescription() {
         return pizza.getDescription();
     }

     @Override
     public int getAmount() {
         return pizza.getAmount();
     }
 }


 //  Concrete Decorator

class PaneerPizzaDecorator extends PizzaDecorator{

    public PaneerPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Paneer";
    }
    @Override
    public int getAmount(){
        return pizza.getAmount() + 2;
    }

}

class ChickenPizzaDecorator extends PizzaDecorator{

    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Chicken";
    }
    @Override
    public int getAmount(){
        return pizza.getAmount() + 3;
    }

}



