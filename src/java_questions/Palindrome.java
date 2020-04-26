package java_questions;

import java.util.ArrayList;

public class Palindrome {


    public static void main(String[] args) {
        String str= "civic";

        System.out.println(isPalindrome(str));

        String [] arr ={"civic","radar","refer","level","kayak","hsbd","sjdgc", "murdrum"};

        System.out.println(listOfPalindrome(arr));

        System.out.println(biggestPalindrome(arr));

        System.out.println(isNumberPalindrome(13401));


    }
//TODO: create boolean return type method that will accept String. If the given string is palindrome, return true.

    public static boolean isPalindrome(String str){

        String palindrome="";


        for (int i = str.length()-1; i >=0 ; i--) {

            palindrome+= str.charAt(i);

        }
        if (palindrome.equals(str)) {
            return true;
        }
            return false;
    }






//Todo create ArrayList<String> return type method that will accept an String Array.
// If elements in array are palindrome, return the list of palindrome words

    public static ArrayList<String> listOfPalindrome(String [] arr){


        ArrayList<String> listOfPalindrome= new ArrayList<>();

        for (String word: arr) {            //"civic","radar","refer","level","kayak","hsbd","sjdgc"
          boolean  isPalindrome = false;
          String   str="";
            for (int i= word.length()-1 ; i>=0; i--) {
                str+= word.charAt(i);
            }
            if (str.equals(word)){
                isPalindrome = true;
                if (isPalindrome)
                    listOfPalindrome.add(word);
            }

        }
        return listOfPalindrome;

    }



//Todo: Create a String return type method that will accept an String Array,
// and find the palindrome words which have the biggest length

    public static String biggestPalindrome(String [] arr){
        ArrayList<String> listOfPalindrome= new ArrayList<>();
        for (String word: arr) {            //"civic","radar","refer","level","kayak","hsbd","sjdgc"
            boolean  isPalindrome = false;
            String   str="";
            for (int i= word.length()-1 ; i>=0; i--) {
                str+= word.charAt(i);
            }
            if (str.equals(word)){
                isPalindrome = true;
                if (isPalindrome)
                    listOfPalindrome.add(word);
            }

        }
        String  biggestPalindrome="";
        for (int i = 0; i <listOfPalindrome.size() ; i++) {

            if (biggestPalindrome.length()<listOfPalindrome.get(i).length()){

                biggestPalindrome=listOfPalindrome.get(i);
            }

        }
        return "The biggest palindrome word from the given array is:   "+ biggestPalindrome;
    }





//Todo create a boolean return type method that will accept an int, if the given int number is palindrome number, return true.

    public static boolean isNumberPalindrome (int num){
        String str = String.valueOf(num);
        String palindrome="";
        for (int i =str.length()-1; i>=0; i--) {

            palindrome+=str.charAt(i);

        }

        if (str.equals(palindrome)){
            return true;
        }
        return false;
    }




//TODO Create a method that will accept a number (long). Return a boolean: true if your given number is a palindrome number or false if it is not
//todo You know how to do it with String manipulation. If you want a challenge do it without using any String in your code
//Ex:
// todo> input: 1001 > output: true
//todo > input: 1234 > output false


    public static boolean palindromeNumber(long number){

        long workingNum = number;
        long reverse = 0;
        while (workingNum!=0){
            long last = workingNum%10;
            reverse=reverse*10 +last;
            workingNum /= 10;
        }
        return number==reverse;
}

}




