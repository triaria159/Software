package org.example;

public class Dog extends Animal{
    public Dog(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void speak() {
        System.out.println("wan!");
    }
}
