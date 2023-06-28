package mentoring.b29_g4.assignments;

import mentoring.A;
import mentoring.B;
import mentoring.C;
import mentoring.D;

import java.util.ArrayList;
import java.util.List;

public class ExampleJavaQuestions  {


    public static void main(String[] args) {


        //String sentence= "I5 a3m an Soft9ware 2 Develop3er";


        //System.out.println(sumOfDigits(sentence));

       // System.out.println(isArmstrong(7576576));

        System.out.println(isPalindrome("Kaya6# k"));

         ExampleJavaQuestions exampleJavaQuestions = new ExampleJavaQuestions();


      





    }

    //TODO    11 - Write a method that will accept a String paramater and return sum of numbers in a string format.
    // Input: "I5 a3m an Soft9ware 2 Develop3er" > output: 5 + 3 + 9 + 2 + 3 = 22





    public static String sumOfDigits(String str) {     // // Input: "I5 a3m an Soft9ware 2 Develop3er"


        String digits ="";

        int sum =0;


        for (int i = 0; i <str.length() ; i++) {          // i = 0, i = 1


            if (Character.isDigit(str.charAt(i))){  // I, 5
             sum += Integer.parseInt(str.charAt(i)+"");  // 5+ 3
                digits += str.charAt(i)+ " + ";

            }

        }


        return  digits.substring(0,digits.length()-3) +" = " +  sum +"";
    }



    //Todo    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number
    // or false if it is not Armstrong number is a number that will take each digit of the number and raise it to the power of the number’s length.
    // Then the results of each operation will be added together. The final result of all the operations will be equal to
    // the original number for an Armstrong number
    // *** In below example case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
    // Exp: input: 153 1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153 > output: true


    public static boolean isArmstrong(int num){ // TODO: 407


        String number= num+"";

        int power = number.length();  // 3 ^

        int sum=0;

        for (int i = 0; i <number.length() ; i++) {  // i=0,i = 1, i=2

            int digit = Integer.parseInt(number.charAt(i)+""); // digit=4  , digit=0 , digit=7;
            sum+= Math.pow(digit,power); // TODO: 4*4*4 = 64;+ , 0*0*0=0; +, 7*7*7= 343
            //sum= 64+0+343= 407

        }

        return num==sum;



    }





    //TODO Create a method which has boolean return Type. This method will accept a string param.
    // Pls Return if given string is Palindrome or not.





   public static boolean isPalindrome (String str){//  kayak



        String cleaned= str.replaceAll("[^a-zA-Z]"," ").replace(" ", "").toLowerCase();

        int start=0; // 0

        int end= cleaned.length()-1; // 4

        while (start<end){

            if (cleaned.charAt(start)!= cleaned.charAt(end)){
                return false;
            }

            start++;
            end--;


        }
        return true;




   }

































}
