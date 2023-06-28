package mentoring.b28_group1;

import mentoring.A;

import java.sql.Array;
import java.util.*;


public class InterviewQuestions {


    public static void main(String[] args) {


        //array -
        ArrayList<Integer> list = new ArrayList();

        // System.out.println(list.add(3));


        // System.out.println(list.size());

        //System.out.println(multiply(238,38473));

        //  [ 1,4,2,6,7,8       ]

        int[] num = {66, 66, 66, 1, 3, 22, 44, 84, 12, 30, 32, 54, 31, 76};


//        for (int i = 0; i < num.length; i++) {
//
//             num [i] = num[i]+1;
//
//        }
        // System.out.println(Arrays.toString(num));


        //loops

        //wrapper classes

        // access modifiers


        // System.out.println(oddNumber(num));


        //swapInt(5,3);
        //swapString("Apple", "Banana");


        // System.out.println("Second max: "+ secondHighest(num));

        //  System.out.println(secondHighest(num));

        String str = "I want to find duplicates words from array I want";

       // System.out.println(returnDuplicateWords(str));
        System.out.println(returnDuplicateWordsAsList(str));


    }


//    public static int multiply(int x , int y){
//
//        return x*y;
//
//    }
//
    //TODO: Create 2 separate methods which will return an  Integer ArrayList. The methods will accept an int array parameter.
    // One method will return every even number from the given int Array and one method will return odd numbers every from the given int array.


    public static ArrayList<Integer> evenNumber(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {    // i = 0,  i = 1, 2

            //     int  [] num = {2,4,6,8,98,99}
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);                                              // arr[i]= 2 , arr[i]= 4
            }


        }

        return list;
    }


    public static ArrayList<Integer> oddNumber(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {    // i = 0,  i = 1, 2

            //     int  [] num = {2,4,6,8,98,99}
            if (arr[i] % 2 != 0) {
                list.add(arr[i]);                                              // arr[i]= 2 , arr[i]= 4
            }


        }

        return list;
    }


//TODO Create 2 separate void methods. First method will swap given 2 integers without creating third variable. This method will have 2 int params.
// The Second method will also be void methods and will accept 2 String params. You will also need to swap variable values without creating third variable.


    public static void swapInt(int num1, int num2) {    // num1 : 5      , num2 : 3


        num1 = num2 + num1; // num1=8
        num2 = num1 - num2;  // num2 : 5

        num1 = num1 - num2; // num1 = 3

        System.out.println("num1 is now =  " + num1 + "  Num2 is now = " + num2);


    }


    public static void swapString(String a, String b) {


        // a = apple
        // b = banana


        a = a + "" + b;   //applebanana

        b = a.substring(0, a.length() - b.length());  // b is apple

        a = a.substring(b.length()); // a = banana


        System.out.println("a is now =  " + a + "  b is now = " + b);


    }


//TODO: Create a method which will return an integer (return type). This method will have an int array parameter.
// Return the number from that array which is the second highest num.
//    Create a method that will accept an int array. Return the number which is the second to biggest number./
//    ** Do not use sort method *   Ex:     > input: 1,3,22,44,12,30,32,54,31 > output: 44


    public static int secondHighest(int[] arr) {


        int max = 4;      // 0
        int secondMax = 1;   // 0

        for (int i = 1; i < arr.length - 1; i++) {      // i = 0, i=1, i=2, i=3

            //arr 66,1,3,22,44,12,30,32,54,31  // arr[i] = 66 , arr[i] = 1

            if (arr[i] > max) {
                secondMax = max;  // secondMax=0
                max = arr[i];    // max = 66

            }
            if (arr[i] > secondMax && arr[i] != max) {

                secondMax = arr[i];  // secondMax= 22

            }
        }


        System.out.println("MAX: " + max);


        return secondMax;


    }


    public static int secondBiggestNumber(int[] arr) {
        int max = arr[0];
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // int[] arr1 = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    public static int secondHighest2(int[] arr) {
        // assume there are at least two elements in the array

        int highest;
        int secondHighest;

        if (arr[0] > arr[1]) {
            highest = arr[0];
            secondHighest = arr[1];
        } else {
            highest = arr[1];
            secondHighest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];

            }
        }
        return secondHighest;
    }


    public static int secondHighest4(int[] arr) {
        // assume there are at least two elements in the array

        int highest = arr[0];
        int secondHighest = arr[7];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (highest == secondHighest) {
                secondHighest = arr[i];
            }
            if (secondHighest < arr[i]) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }


    // TODO: "I want to find duplicates words from array I want"
    // Create a method it will accept a string param. Return every duplicate words from string and return as a list


    public static Set<String> returnDuplicateWords(String str) {

        Set<String> duplicates = new HashSet<>();
        Set<String> uniqueWords = new HashSet<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;

    }


    public static List<String> returnDuplicateWordsAsList(String str) {

        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String [] arr= str.split(" ");  // "I want to find duplicates words from the array I want"





        for (int i = 0; i <arr.length ; i++) {

            String tempStr="";
            int count =0;

            for (int j = 0; j <arr.length-1 ; j++) {

                if (arr[i].equals(arr[j+1])){
                    count++;
                    tempStr=  arr[i];
                }

            }

            if (count >= 1){
                list.add(tempStr);
            }

        }
        return list;

    }


}