package org.example;
import java.util.ArrayList;
import java.util.List;
public class AnimalFarm {
    private List<Animal> animals;
    public AnimalFarm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void makeSpecificAnimalSpeak(String name) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            animal.speak();
        } else {
            System.out.println("No animal with the name " + name + " found in the farm.");
        }
    }

    public void makeAllAnimalsSpeak() {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public void displayAllAnimalsInfo() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}
