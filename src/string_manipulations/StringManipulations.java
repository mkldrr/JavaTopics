package string_manipulations;

import javax.swing.text.Position;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManipulations {

//
//    STRING MANIPULATIONS
//
//    OBJECTS
//    we always use for double quote “” for string.
//            Concatenate : add two strings together [+]
//    String word = “” > even if inside is empty, it is a string.
//
//    String methods
//
//
//    Index = Position of a character (starts from 0)  (charAt).


    public static void main(String[] args) {

        //equals

        String name ="Michael Jordon";
        String name2 = "Kobe Bryant";

        //equals

        if (name.equals(name2)){
            System.out.println("names are equal");
        }else {
            System.out.println("names are not equal");
        }

        System.out.println(name.equals(name2));


        //length

        System.out.println("name length is: "+name.length() + ", name2 length is " + name2.length());

        //isEmpty

        System.out.println(name.isEmpty());
        //System.out.println(name2.isEmpty());

        //charAt()

        //it takes index, int and returns char

        System.out.println("in the 3th index, the char is : "+ name.charAt(3));


        //contains : takes string, returns boolean

        System.out.println("contains methods:    "+ name.contains("n"));


        //*equalsIgnoreCase( ) : takes string and returns boolean. Ignores capital or lowercase.

        System.out.println("equal ignore case: " + name.equalsIgnoreCase("MICHAEL JORDON"));


        //IndexOf ( ): it will give where that letter or word starts. If it cannot find it, it will give us as -1


        System.out.println("index of method: " + name.indexOf(" Jordon"));


        //lastIndexOf ( ) ;

        System.out.println("last of index of : " + name.lastIndexOf("Michael"));


        //toLowerCase ( ); will turn all characters in the string to lowercase. Takes string return string

        System.out.println("toLowerCase : "+name.toLowerCase());

        //toUpperCase

        System.out.println("toUpperCase : " + name2.toUpperCase());

        //Substring ( 0 ) : it will take integer, and returns string


        System.out.println("one index Substring: " + name.substring(5)); //Michael Jordon
        System.out.println("two int subString: " + name.substring(3,9));


        //startsWith ( ): check if the string begins with the passed string
        //Takes string
        //Returns boolean

        System.out.println("Starts with example: " + name.startsWith("M") );


//        *endsWith ( ): Check if the string ends with the passed string
//        Takes string
//        Returns boolean


        System.out.println("endsWith practice: " + name2.endsWith("e"));

        //trim ()

        System.out.println(" mchldrr ".trim());

        //compareTo ( ): will compare how the passed String is related to the string being checked lexicographically
        //Lexicographically ( Strats with numbers …
        //
        //Takes string
        //Returns integers

        System.out.println("Compareto method practice: "+ "Hello".compareTo("Hello"));

        //replace

        System.out.println("Replace practice: " + name.replace("Mi","Xe"));

        //concat

        System.out.println("concat: "+name.concat(name2));
       // System.out.println(name+name2);

        //toCharArray
        char[] charrArray= name.toCharArray();
        System.out.println(Arrays.toString(charrArray));

        System.out.println(Arrays.toString(name.toCharArray()));


        //getByte
        System.out.println("getByte example: "+ Arrays.toString(name.getBytes()));



        String s1="ABC";
        byte [] b=s1.getBytes();
        for (int i=0;i<b.length;i++){
            if(s1.charAt(1)==b[i]){
                System.out.println(b[i]);
            }
            System.out.println(b[i]);
        }






















    }




}
