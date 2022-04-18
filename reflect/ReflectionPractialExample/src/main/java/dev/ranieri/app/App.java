package dev.ranieri.app;

import dev.ranieri.entities.Dog;

import dev.ranieri.entities.Person;

public class App {

    public static void main(String[] args) {
        Person adam = new Person();
        adam.setId(101);
        adam.setFname("Adam");
        adam.setLname("Ranieri");
        adam.setAge(19);
        System.out.println(adam);

        Dog rover = new Dog();
        rover.setName("Rover");
        rover.setOwner("Bill");
        rover.setAge(5);
        System.out.println(rover);

        Dog jimbo = new Dog("Jimbo","Fisher",10);

    }
}
