package data_types;

import java.util.Arrays;

public class DataTypes {

    //Variable: it is something that can store a piece of data -  info
    // Every different categorical info goes to different variable.

    //primitive:

//> byte
//> short
//> int
//> long
//> float
//> double
//> char
//> boolean

    //Non primitives:

//object:
    //string
    //classes (user defined)





    public static void main(String[] args) {


//Type Casting
        int number=1234;  // name of the variable is number, and i store the information on it. data type of my variable is "int"
        long longNum= 12312345622L;
        short shortNum= 12311;

        int newNum = (int) longNum;


        long newLong= number;

        char newchar='b';

        number= newchar;

        String name = "Mkldrrkni";

        Object object = name;

        Arrays [] newarr= new Arrays[1];




        name= (String) object;
        System.out.println(object);
        System.out.println(name);




        System.out.println(number);


    }






}
