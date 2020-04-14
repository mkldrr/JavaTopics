package oop;

public class Huskey extends Dog {



    String furType;
    public Huskey (){
        this.furType="Colden";
    }
    public void liveInCold() {
        System.out.println("Huskey is living in the cold weather");
    }
    public static void main(String[] args) {
        Huskey huskey=new Huskey();
        huskey.furType="GoldfurType";
        huskey.liveInCold();
        huskey.name="BKJHKJ";
        huskey.breed="brazilian";
        huskey.color="White";
        huskey.age=5;
        System.out.println(huskey.age);
        huskey.run();
        huskey.sleeping();
        huskey.bark();
        huskey.eat();
        System.out.println(huskey.has4leg=true);
    }




}
