package oop.polymorphism;

public class Animal {



    String name;
    int age;
    String breed;
    String color;
    public  void run( ){
        System.out.println(this.name+ "  is running ");
    }
    public void sleeping(){
        System.out.println(this.name+ "  is sleeping");
    }
    public  void doingAction(){
        System.out.println(" Animal doing some action");
    }


}
