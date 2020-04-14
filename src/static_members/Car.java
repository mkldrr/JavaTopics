package static_members;

public class Car {


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

    public static void info(){

        System.out.println("price :"+ price);
        System.out.println("model  :"+ model);
        System.out.println("type :"+ type);
        System.out.println("color :"+ color);

    }
}
