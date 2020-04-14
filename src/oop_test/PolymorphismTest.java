package oop_test;

import oop.polymorphism.Animal;
import oop.polymorphism.Bird;

public class PolymorphismTest {



    public static void main(String[] args) {
        Animal animal = new Bird();//upcasting from upper to down
        animal.doingAction();
//        Bird bird = (Bird)new Animal();// downcasting is from smaller to upper level
//        bird.fly();
    }
}
