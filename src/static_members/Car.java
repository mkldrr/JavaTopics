package static_members;

import javax.imageio.stream.ImageInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Car {







    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();


        List list1 = new ArrayList<>();


        list.add(3);
        list.add(65);



         String [] str = {"",""};








    }


    public Car(boolean tiers ){



    }

    public Car( ){



    }
    Car car = new Car();

    static long price;
    static String model;
    static String  type;
    static  String color;
    String name;

    static {

        price=2367889;
        model="AUDI";
        type="SPORT";
        color="Grey";

        if(price>100000){
            System.out.println(model+ "  is too expensive");
        }
        System.out.println("This is static block it is gonna print first!");
    }

    public    void info(){

        System.out.println("price :"+ price);
        System.out.println("model  :"+ model);
        System.out.println("type :"+ type);
        System.out.println("color :"+ color);

    }
}
