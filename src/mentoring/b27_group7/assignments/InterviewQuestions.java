package mentoring.b27_group7.assignments;

import java.util.ArrayList;

public class InterviewQuestions {



    //TODO: Create a method which will return an  Integer ArrayList. The method will accept an int array parameter.
    // Return every even number which are in the Array. [2,5,18,8,56,9,4,7]




     int num5=9;



    public static ArrayList<Integer> evens(int [] arr){  // [2,5,18,8,56,9,4,7]

        ArrayList evenList = new ArrayList();


        for (int i = 0; i <arr.length ; i++) {  // i: 0 , i: 1 , i: 2, i:3

            if (arr[i] %2==0){ // arr[0]= 2 arr[1]=5  arr[2]= 18 arr[3]=8

                evenList.add(arr[i]); //2, .. , 18,8
            }


        }

        return evenList;
    }












    public static ArrayList<Integer> returnEvenNumbers(int [] arr){

        ArrayList<Integer> listOfEvenNumbers = new  ArrayList();

        for (int i = 0; i < arr.length ; i++) {    //arr= { 2,53,78,2,0,2,4,2,7,3}
            if (arr[i]%2== 0);// arr[i]=2 ;  arr[i]=53
            listOfEvenNumbers.add(arr[i]);
        }
        return listOfEvenNumbers;


    }




    //TODO    11 - Write a method that will accept a String paramater and return sum of numbers in a string format.
    // Input: "I5 a3m an Soft9ware 2 Develop3er" > output: 5 + 3 + 9 + 2 + 3 = 22
    public static String sumOfDigits(String sentence){   // "I5 a3m an Soft9ware 2 Develop3er"

        String digits ="";

        int sum= 0;

        for (int i = 0; i <sentence.length() ; i++) {  // i : 0, i:1

            if (Character.isDigit(sentence.charAt(i))) {
                sum += Integer.parseInt(sentence.charAt(i) + "");
                digits += sentence.charAt(i) + " + ";

            }
        }
        return digits.substring(0,digits.length()-3)+ " = " + sum;


    }





    //    TODO Find Second Max Number
    //     Create a method that will accept an int array. Your method will return int. Return the number which is the second to biggest number./
    //     ** Do not use sort method *   Ex:     > input: 1,3,22,44,12,30,32,54,31 > output: 44




    public int secondMax(int [] arr ){   // 1,3,22,44,25,30,32,54,31



        int max       = arr[1];   // 3

        int secondMax = arr[1];   // 3


        for (int i = 0; i <arr.length ; i++) {   // i: 0, i: 1 , i: 2, i : 3, i : 4; i :5


            if (arr[i]>max){    // arr[i]: 1, arr[i]:3, arr[i]:22 , arr[i]:44 arr[ i ] : 25

                secondMax=max;  // 3,1, 3, 22, 25
                max=arr[i]; //  1, 3 , 22, 44

            }

            if (arr[i] > secondMax && arr[i]<max){
                secondMax= arr[i];

            }

        }

        return secondMax;


    }




    //TODO : Write method which will return an Integer ArrayList. This method should accept an
    // int array. Please return the non- duplicate numbers as a list from the given array param.


    public static ArrayList<Integer> returnNonDub(int [] arr  ){  // [ 2,17,2, 5 ]  13


        ArrayList <Integer> arrayList= new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {  // i =0  // arr[ i ] ==2

            boolean check = true;

            for (int j = 0; j <arr.length ; j++) { // j = 0, arr[ j ] = 2;... j = 2...  arr[j] = 2

                if (arr[i] == arr[j] &&  i != j ){
                    check=false;
                }
            }

            // this part runs after inner loop finishes.
            if (check){
                arrayList.add(arr[i]);
            }

        }
        return arrayList;


    }



    public static ArrayList<Integer> nums (int [] arr){
        ArrayList<Integer> num = new ArrayList<>();
        for (int each : arr){
            if (!num.contains(each)){
                num.add(each);
            }
        }
        return num;
    }


    public static ArrayList<Integer> nonDuplicate (int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count < 2) {
                result.add(arr[i]);
            }

        }
        return result;
    }






    public static void main(String[] args) {

        int [] arr = {2,2,17,2,5 , 7,7};
        // System.out.println(evens(arr));


       // String sentence = "I5 a3m an Soft9ware 2 Develop3er";

      //  System.out.println(sumOfDigits(sentence));

       // System.out.println(nonDuplicate(arr)); // 2,5,18,8,56,9,4,7 //

        occurrenceOfLetters("abra cadabra");



    }





    ///

    // TODO Create one void type method. This method will have one String param. Pls return occurrence of letters from the given string as following format:
    // Given String param: "abracadabra"
    //print as
    //abracadabra =  has 5 times a
    //abracadabra =  has 2 times b
    //abracadabra =  has 2 times r
    //abracadabra =  has 1 times c
    //abracadabra =  has 1 times d





    public  static void occurrenceOfLetters(String word){

        String checked="";
        int count=0;
        for (int i = 0; i <word.length() ; i++) { // 1
            if (!checked.contains(word.charAt(i)+"")){ ///   a  , b                       abracadabra

                for (int j = 0; j <word.length() ; j++) { // abracadabra
                    if (word.charAt(i)==word.charAt(j)){   //
                        count++;
                    }
                }
                checked+= word.charAt(i)+" ";  //  "a    brcd "
                System.out.println(word + " =  has " + count + " times " + word.charAt(i) );
                count=0;
            }
        }

    }












}
