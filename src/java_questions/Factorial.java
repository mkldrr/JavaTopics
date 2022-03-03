package java_questions;

public class Factorial {

 static String str;


    public static void main(String[] args) {
        int num = 10;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);

        System.out.println(str);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }


    public void conctr(){


        str="hello world ";

    }





}
