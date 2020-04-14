package oop.polymorphism;

public class Polymorphism {



 //   Is a relationship : it is simply inheritance. Child class IS -A parent class.
//    Child class IS-A  ancestor class.
//    Ex: Nokia —> Phone —> Device —> Object: inheritance
//
//    IS-A relationship also support Interface Relationship
//    Ex: Nokia implements waterproof.
//    Nokia is a waterproof.
//
//            *Class that implements interface IS-A interface
//
//——————————————————————————————————————————
//    Meaning of Polymorphism is "Many Form".
//            .It is the ability of an object to take on many/multiple forms.
//    Animal a = new Animal ( ); // this is how we do usually. Animal is reference and
// new Animal : this is actual object.
//    In polymorphism, we are able to use the class itself for any ancestor as a reference type for an object.
//    Animal a = new Horse ();
//    Animal a2 = new Dog ();
//    Animal a3 = new Cat ();
    //Dynamic Polymorphism and Static Polymorphism
    //Dynamic Polymorphism : method overriding
    //      — which version of the method will be called?
    // — until java runs the code, it won't be able to tell which version of method gets executed. It will               be decided during runtime dynamically.
    //Ex: PaymentMethod pm = new PayPal();
    //
    //pm.charge // here we call the one overridden in the PayPal.
    //Static Polymorphism : method overloading
    //     — whenever we have two or more methods with the same name, and we call the methods with proper
    //
    //     given parameters, Java know %100 which methods gets called. It determines with the number of          parameters passed to the method call.
    //      public class Cup{
    // public void pour(){
    // sout ("pouring");
    //         }
    //      public void pour(String s){
    // sout ("pouring" + s);
    //         }
    //}
    //Cup cup = new Cup();
    //
    //cup.pour("milk"); here we call the second one.

}
