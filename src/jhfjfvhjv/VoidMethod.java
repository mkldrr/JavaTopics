package jhfjfvhjv;

import java.util.Random;
import java.util.Scanner;

public class VoidMethod {



    public static void main(String[] args) {


        printNum();
        int [] arr={-3,7,9,-34,-86,0,4,6,-3,0};
        printNegative(arr);

        VoidMethod voidMethod=new VoidMethod();
        voidMethod.checkLetngth("Michael",7);

        plusMinus(arr);

        stringContains("Stanislav","Bondav");


    }

    public static  void printNum(){
        Random random=new Random();

        int rnum=random.nextInt(50);

        System.out.println(rnum);

    }

    public static void printNegative(int [] arr){

        for (int i=0;i<arr.length;i++){

            if (arr[i]<0){

                System.out.println(arr[i]);
            }

        }

    }

//        Create a method that accepts String and int.
//        Check if string length is same as given integer.
//        Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.

    public  void checkLetngth(String str,int num){

        if(str.length()==num){

            System.out.println("the length is equal");
        }

        else {

            System.out.println("The length is not equal");
        }
    }


    public static void plusMinus(int [] arr){

        int countPositive=0;
        int countNegative=0;
        int countZero=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>0){
                countPositive++;
            }
            if(arr[i]<0){
                countNegative++;
            }
            if (arr[i]==0){
                countZero++;
            }

        }
        System.out.println(" Positive : "+ countPositive+" negative : "+countNegative+" Zeros : "+ countZero);

    }

//        Write a method that takes two Strings.
//        Check if the second String is found inside of the first String.
//        If it does, remove that part from the String,
//        but if the second String is not in the first String:  ask the user to enter another String to try again.

    public static void stringContains(String str1,String str2) {
        if (str1.contains(str2)) {
            str1 = str1.replace(str2, "mkl");
            System.out.println(str1.trim());
        } else {
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again = input.nextLine();
            if (str1.contains(again)) {
                str1 = str1.replace(again, "mkl");
                System.out.println(str1.trim());
            } else {
                System.out.println("Out of tries");
            }
        }
    }

}
