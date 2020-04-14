package constructors;

public class House {



    String color;
    int price;
    String adress;
    String type;

    public House(String color,int price,String adress,String type){



//        this.color="White";
//        this.price=126466747;
//        this.adress="Collum str";
//        this.type="SingleHouse";

        //this()- calling the constr in the current class
        this.color=color;//(instance variable)
        this.adress=adress;
        this.type=type;
        this.price=price;

    }

    public void info(){

        System.out.println("color : "+ color+ " type "+ type+ " price "+ price+ " adress:"+ adress);


    }

}
