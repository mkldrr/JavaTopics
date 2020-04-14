package oop;

public class Abstraction {

    //    Abstract: summary, abstract art, general, high level, not concrete, not specific.
//            - Abstraction in Java: focusing on the "what is does" rather than focusing on "How it does".
//            - Focusing on the high level methods, NOT focusing on the implementation of it.
//            - Ex: Browser => We know browsers MUST have launch, browse, addTab, switchTab, closeSpecificTab, closeBrowser etc methods. In Abstraction we ONLY declare the methods, but we don't write any code of it. Because it is abstract.
//
//    In Java Abstraction is done in 2 ways:
////            1. Abstract class
//            - we add "abstract" keyword to class declaration
//Ex:
//    public abstract class Browser {
////    }
//- Abstract class Browser now CAN have abstract methods.
//- Abstract method: a method that doesn't have an implementation.
//    Syntax: we add "abstract" keyword when declaring the method.
//* Abstraction doesn't have anything to do with variables.
//
//
//            * We CANNOT create an object from an abstract class.
//    Abstract class: a class that can have both abstract and non-abstract methods.
//    Abstract class is meant to be a parent of another class.
//
//
//    Abstract class rules:
//            —cannot be instantiated. Because it might have abstract methods.
//— can have both abstract and non-abstract methods.
//—*static methods cannot be abstract. Because you cannot override them.
//—Abstract classes MEANT TO BE extended by some other classes.
//            —Does abstract class extends to any class?
//            —abstract can be extended. It already extends the object class.
//            —Can abstract class have only non abstract methods?
//            — yes but it does not make sense.
//—the child class that is extending to the abstract class is called Concrete Class.
//
//            — Can we instantiate abstract class if we don't have any abstract method in it?
//            — No we cannot.
//— Can abstract class override the methods.
//            —we can override.




}
