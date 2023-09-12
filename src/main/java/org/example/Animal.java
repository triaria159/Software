package org.example;

public class Animal {
    private String name;
    private double weight;
    private String color;
    public Animal(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public void speak() {

    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Weight: " + weight + " kg, Color: " + color);
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = (String) name;
    }
}
