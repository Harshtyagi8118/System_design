package DesignPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ObserverPattern {
    public static void main(String[] args){
        Observer observer1 = new Subscriber("Harsh");
        Observer observer2 = new Subscriber("Shankey");

        Publisher publisher = new Publisher();
        publisher.addObserver(observer1);
        publisher.addObserver(observer2);
        publisher.notifyObserver("Khana Khaa le...");
    }
}

interface Observer{
    void update(String message);
}

class Subscriber implements Observer{

    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " receved message " + message);
    }
}

class Publisher{
    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notifyObserver(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}

