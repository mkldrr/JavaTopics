package classes_objects;

public class Computer {



    String color;
    String model;
    int price;
    String memory;



    public Computer ( String color, String model, int price, String memory){


        this.color=color;
        this.memory=memory;
        this.model=model;
        this.price=price;


    }
    public Computer(){

    }



    void playMusic(int age ){

    }

    void playMusic( ){

    }






    public  void info(){

        System.out.println("color : "+ color+ " model "+ model+ " price "+ price+ " Memory :"+ memory);

    }









}
