package java_questions;

public class FibonacciNumbers {




//    2-)Fibonacci
//    Create a method that will accept a number (int). Return a String with each Fibonacci number separated by a space. The amount of Fibonacci numbers in the String is determined by the given number
//    Ex:


    public static void main(String[] args) {

        System.out.println(fibonacciNumbers(10));

    }




    public static String fibonacciNumbers(int num){


        String fibonacciNumbers="";

        int number1=0;
        int number2=1;
        int sum=0;


        for (int i = 0; i <num ; i++) {
            fibonacciNumbers+=number1 + " ";
            sum= number1+number2;
            number1=number2;
            number2=sum;

        }

        return fibonacciNumbers;



    }






}
