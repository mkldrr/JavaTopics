package mentoring.b26_group13.assignments;

import java.util.ArrayList;

public class Questions {


    public static void main(String[] args) {


        int [] arr = {47,47,46,29,34,34,23,12,6,6};
       // System.out.println(evenNums(arr));


        //String str = "I5 a3m an Soft9ware 2 Develop3er";

        //System.out.println(sumOfDigits(str));


       // System.out.println(nonDuplicateNums(arr));


        occurenceOfLetter("abrakadabra");








        boolean check =true;

        while (check){
            //logic comes here
        }


        for (int i = 2; i <1 ; i++) {

        }








    }




    //TODO: Create a method which will return an  Integer ArrayList. The method will accept an int array parameter.
    // Return every even number which are in the Array.




    public static ArrayList<Integer> evenNums(int [] arr){
                                                             //[ 47,46,29,34,23,12,6 ]
        ArrayList<Integer> evenNums = new ArrayList<>();

        for (int i=0; i<arr.length; i++ ){     // i> 3  arr[3]>

            if (arr[i]%2==0) {          //
                evenNums.add(arr[i]);
            }
        }
        return evenNums;


    }












    //TODO    11 - Write a method that will accept a String paramater and return sum of numbers in a string format.
    // Input: "I5 a3m an Soft9ware 2 Develop3er" > output: 5 + 3 + 9 + 2 + 3 = 22


    public static String sumOfDigits(String sentence) {  //// Input: "I5 a3m an Soft9ware 2 Develop3er"


        String digits = "";



        int sum = 0;



        for (int i = 0; i < sentence.length(); i++) {
            //TODO Input: "I5 a3m an Soft9ware 2 Develop3er"                   output: 5 + 3 + 9 + 2 + 3 = 22

            if (Character.isDigit(sentence.charAt(i))) {  // i: 0, 1 , 2, 3

                sum += Integer.parseInt(sentence.charAt(i) + "");//  22
                digits += sentence.charAt(i) + " + "; // 5 + 3 + 9 + 2 + 3
            }
        }




        return digits.substring(0, digits.length() - 3) + " = " + sum;
    }





    //TODO ================================================================================================================

    //TODO : Write method which will return an Integer ArrayList. This method should accept and int array. Please return the non-
    // duplicate numbers from the array



    public static ArrayList<Integer> returnNonDub(int [] arr){ // [1,3,7,1,3,9];

        ArrayList<Integer> uniques = new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {    // i > index 0,.2...                 [1,3 , 7

            boolean check = true;         // true

            for (int j = 0; j <arr.length ; j++) {   // j > index 0, 1,2, [ 1,3,7

                if (arr[i] == arr[j] && i != j){

                    check = false;
                }
            }
            //===========
            if (check) uniques.add(arr[i]);
        }

        return uniques;
    }

// EXAMPLES




    public static ArrayList<Integer> nonDuplicateArrayList(int [] arr){    // [1,3,7,1,3,9];
        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> checked= new ArrayList<>(); // 1    ,1



        for (Integer number :arr) {
            int count = 0;
            if (!checked.contains(number)) {
                for (int i = 0; i < arr.length; i++) {
                    if (number == arr[i]) {
                        count++;
                    }
                }
                checked.add(number);
                if (count == 1) {
                    unique.add(number);
                }
            }

        }

        return unique;
    }




    public static ArrayList<Integer> removeDuplicateNum(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int each : nums) {
            int count = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (each == nums.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result.add(each);
            }
        }
        return result;
    }




    public static ArrayList<Integer> nonDuplicateNums(int [] nums) {   // [1,3,7,1,3,9];
        ArrayList<Integer> newNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {  // i 0 = 1, num[i]= 3
            int count = 0;

            for (int j = 0; j < nums.length; j++) { //j 0 = 1 , j 1 = 3, j 2 = 7, j 3  = 1
                if (nums[i] == nums[j]) {
                    count++; // 1+1=2
                }
            }
            if (count == 1) {
                newNums.add(nums[i]);
            }
        }// end outer loop
        return newNums;
    }




    //TODO Create a void method which will swap 2 integer without creating third variable. This method will have 2 int params.

// int a = 3
// int b = 5

// a will become 5;
// b will become 3;


    public static void swap(int a, int b) {

// int a = 3
// int b = 5


        a = a + b;  //8

        b = a - b;  //3

        a = a - b; //5

        System.out.println("a: " + a + " b: " + b);

    }


    public static void swapStrings(String a, String b) {


        //a:  apple
        //b:  banana
        //substring
        a = a + "" + b; // : applebanana
        b = a.substring(0, a.length() - b.length()); // b: apple
        a = a.substring(b.length());
        System.out.println("word a: " + a + "     word b: " + b);


    }



//Todo    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number
//    or false if it is not
//    — Armstrong number is a number that will take each digit of the number and raise it to the power of the number’s length.
//    Then the results of each operation will be added together. The final result of all the operations will be equal to
//    the original number for an Armstrong number.
//    *** In below example case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
//    Ex:
//  > input: 153 1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153 > output: true




    public static boolean isArmstrong(int num ){

        String number= num+"";
        int power = number.length();
        int sum = 0;
        for (int i = 0; i <power ; i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum+= Math.pow(digit,power); //);//(digit*power)//  + (digit*power)    +    (digit*power);

        }
        return sum==num;

    }


    // Sample solution by students:

    public static boolean armstrongNumber(int number) {

        int temp = number;
        int lastDigit = 0;
        int armstrong = 0;
        String size = String.valueOf(number);

        while (number > 0) {
            lastDigit = number % 10;
            armstrong += Math.pow(lastDigit, size.length());
            number = number / 10;
        }
        if (temp == armstrong) {
            return true;
        }
        return false;
    }






// TODO =============================================================================================================



    //TODO Occurrences of letters in a string "abrakadabra" : Create  void method which will accept a string " abrakadabra".
    // Please find the how many
    // times each letter occurs/dispay in the string and print in the following format:

//    abrakadabra =  has 5 times a
//    abrakadabra =  has 2 times b
//    abrakadabra =  has 2 times r
//    abrakadabra =  has 1 times k
//    abrakadabra =  has 1 times d



    public static void occurenceOfLetter(String sentence){  // abrakadabra




        String checked ="";

        for (int i = 0; i <sentence.length() ; i++) {    //0. i: a

            int count =0;
            if (!checked.contains(sentence.charAt(i)+"")){

                for (int j = 0; j <sentence.length() ; j++) {

                    if (sentence.charAt(i) == sentence.charAt(j)) { //0. j: a // 1. j : b //2 j: r // 3 j : a


                        count++; // 1+1+1+1+1
                    }
                }
                checked+=sentence.charAt(i)+""; // a

                System.out.println(sentence + " = has " + count + " times " + sentence.charAt(i) );


            }

        }




    }































}
