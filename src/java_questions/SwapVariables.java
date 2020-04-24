package java_questions;

public class SwapVariables {


    public static void main(String[] args) {


        int num1 =12;
        int num2=33;
        swapVariables(num1,num2);

    }





    public static void swapVariables(int num1, int num2){

        num1 = num1+num2;

        num2=num1-num2;

        num1=num1-num2;

        System.out.println("num1: " + num1+ " num2: " + num2);



    }
}
