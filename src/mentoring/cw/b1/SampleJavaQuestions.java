package mentoring.cw.b1;

import java.util.ArrayList;

public class SampleJavaQuestions {

//TODO    4-) Armstrong Number
//    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number or false if it is not
//    Armstrong number is a number that will take each digit of the number and raise it to the power of the number's length.
// Then the results of each operation will be added together.
// The final result of all the operations will be equal to the original number for an Armstrong number.
//  *** In our case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
//    Ex: > input: 153 1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153 > output: true




    public static boolean isArmstrong(int num ){// 153

        String number= num+"";  //"153"
        int power = number.length();// 3
        int sum = 0;
        for (int i = 0; i <number.length() ; i++) {



            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));//  3
            sum+= Math.pow(digit,power); //);//(digit*power)//  + (digit*power)    +    (digit*power);  // sum=1+125+27=153

        }
        return sum==num;

    }

    




    //T===============================================================================================================







   //TODO 11 - Write a method that will accept a string and return sum of numbers in a string.
    // Input: "I5 a3m an Soft9ware 2 Develop3er in Test" output: 5 + 3 + 9 + 2 + 3  = 22 (Got this question in Here)



    public static String sumOfDigits(String sentence) {  //// Input: "I5 a3m an Soft9ware 2 Develop3er"

        String digits = "";
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {

                sum += Integer.parseInt(sentence.charAt(i) + "");//5
                digits += sentence.charAt(i) + " + ";
            }
        }
        return digits.substring(0, digits.length() - 2) + " = " + sum;
    }







    //===============================================================================================================

    //TODO 6-) Remove Duplicates from Array> Create a method that will accept an int array. Return an int array with only unique values.
    // If there is a duplicate element, only include one instance of that element. Ex: > input: 2,3,1,1,3,5,2,6,4 > output: [2, 3, 1, 5, 6, 4]



    public static ArrayList<Integer> removeDuplicates(int [] arr){   // 2,3,1,1,3,5,2,6,4

        ArrayList<Integer> removeDuplicatesList= new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (!removeDuplicatesList.contains(arr[i])){
                removeDuplicatesList.add(arr[i]);
            }
        }
        return removeDuplicatesList;


    }


    public static ArrayList<Integer> nonDuplicates(int[] array){  // // 2,3,1,1,3,5,2,6,4
        ArrayList<Integer> list=new ArrayList<>();



        for (int each : array) {  // 2, 3
            int count=0;
            for (int i = 0; i < array.length; i++) {
                if(each==array[i]){
                    count++;
                }
            }


            if(count==1){
                list.add(each);
            }
        }
        return list;
    }



}
