package oop;

public abstract class Human  {


    //abstract
    //1 abstract
    //2 non abstact
    // Abstract class rules:
//            —cannot be instantiated. Because it might have abstract methods.
//— can have both abstract and non-abstract methods.
//—*static methods cannot be abstract. Because you cannot override them.
//—Abstract classes MEANT TO BE extended by some other classes.
//            —Does abstract class extends to any class?
//            —abstract can be extended. It already extends the object class.
//            —Can abstract class have only non abstract methods?
//            — yes but it does not make sense.
//—the child class that is extending to the abstract class is called Concrete Class.
    int age;
    String name;
    public Human(){
        this.age=34;
        this.name="Henry";
    }
    public abstract void sleeping();
    public abstract void talking();
    public static void run(){
        System.out.println("Human is running ");
    }
    @Override
    public String toString(){
        return "name is: "+this.name+ " age is :"+this.age;
    }



}
