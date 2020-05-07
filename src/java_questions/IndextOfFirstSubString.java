package java_questions;

import java.util.Arrays;

public class IndextOfFirstSubString {


    public static void main(String[] args) {

        String parent = "Sunday";

        String substring= "day";


        System.out.println(indexOfFirstSubString(parent,substring));





    }
    //TODO: Given two strings, the method return an int with the index of start of the first occurance of the substring
    // Within the parent string
    // parent : Sunday
    // substring: day
    // return 3


   static int indexOfFirstSubString(String parent, String substring){

        int num = parent.indexOf(substring);


        return num;




    }



}
