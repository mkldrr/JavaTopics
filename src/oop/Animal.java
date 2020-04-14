package oop;

public class Animal {
    String name;
    int age;
    String breed;
    String color;
    public static String size ="animal size";

    public Animal(){
        this.name="gfhjk";
        this.age=4;
        this.breed="animal type";
        this.color="red";
    }
    public  void run( ){
        System.out.println(this.name+ "  is running ");
    }
    public void sleeping(){
        System.out.println(this.name+ "  is sleeping");
    }
    public  void doingAction(){
        System.out.println(" Animal doing some action");
    }
    public static void staticMethod(){
        System.out.println("Animal's static mehod");
    }
    //    public static void staticMethod(int size){
//
//        System.out.println("Animal's static mehod");
//
//    }
    public  void eat() {
        System.out.println("Animal is eating");
    }
    public  void eat(String food){
        System.out.println(" Animal is eating " + food);
    }




}
