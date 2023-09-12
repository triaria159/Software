package org.example;

public class Main {
    public static void main(String[] args) {
        AnimalFarm farm = new AnimalFarm();
        Dog dog1 = new Dog("Buddy", 10, "Brown");
        Cat cat1 = new Cat("Whiskers", 5, "Gray");
        Chicken chicken1 = new Chicken("Henrietta", 2, "White");

        farm.addAnimal(dog1);
        farm.addAnimal(cat1);
        farm.addAnimal(chicken1);

        farm.makeSpecificAnimalSpeak("Buddy");
        farm.makeAllAnimalsSpeak();
        farm.displayAllAnimalsInfo();
    }
}