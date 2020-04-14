package oop;

public class Dog  extends Animal{

    //    This : keyword reference current object,class
//    This ( ): is referring to the current class constructor.
//
//    Super :
//            — is reference to super or parent class object.
//            — how can we use non-static variable and non static methods in java?
//            — creating object.
//    In inheritance process, every single class that gets involved in the
//
//
//            Super ( ) : must be declared as first statement. Reason: super/ parent class object can be created first.
//            -Instead of super ( ), this ( ) can be used, however super class object gets created then.
//            — using constructor chaining.
//            Why class is complaining when we create a constructor with parameter and use inheritance.
//    Super keyword is used for instance variables objects.

    boolean has4leg;
    //public static String size ="dogsize";

    public Dog(){

        super();
        super.name="dog name";
        super.age=2;

    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

    @Override
    public void doingAction(){

        System.out.println("dog is doing action");

    }

//
//    public static void staticMethod(){
//
//        System.out.println("Animal's static mehod");
//
//    }


    public static void main(String[] args) {

        Dog dog=new Dog();
        // dog.name="Bob";
        //dog.age=2;
        // dog.breed="huskey";
        // dog.color="Black";
        dog.doingAction();

        dog.run();
        dog.sleeping();
        dog.bark();


        System.out.println("dog age"+ dog.age);
        //System.out.println(size);

        //dog.has4leg=true;


        Animal animal = new Dog();
        animal.doingAction();//dynamic polymorph  -override

        animal.eat();///       static  overloading oop.polymorphism
        animal.eat("beef");
        animal.staticMethod();

    }


}
