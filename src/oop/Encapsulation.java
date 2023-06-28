package oop;

import java.util.Scanner;



public class Encapsulation {


    //    Java is not the only use oop, there are also other programming languages which are oop.
//
//    We treat everything as  an object in Java.
//    Four (4 ) principles of OOP
    //1. Encapsulation:
//    1- Encapsulation     :   Protecting the data being accessed DIRECTLY from outside of the class.
    // 2 steps in order to achieve encapsulation
    //make variables private,and provide public method for this private variables to get and set methods
    private String userName;
    private String password;
    private int num=0;


    public static void main(String[] args) {


        int  [][] arr =

                {       {    1,0,1,0,0       },
                        {    1,1,1,0,1       },
                        {    0,0,0,1,1       },
                        {    1,0,1,0,0       },
                        {    1,0,1,0,1       }       };







    }


    public String getUserName() {

        return userName;
    }
    public void setUserName(String userName) {
        if(userName.length()>10){
            System.out.println("username is valid ");
            this.userName=userName;
        }else {
            System.out.println("user name should have more character");
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }







}
