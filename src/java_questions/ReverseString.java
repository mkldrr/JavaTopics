package java_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str= "Mikail wants to go to cinema";

        //System.out.println(reverseString(str));


      //reverseArray(str);

    //   reverseNumbers(2345);

        int [] arr= {14,5,2,5,2,6,2};

        System.out.println(Arrays.toString(reverseIntArray(arr)));




    }









    //1.


    public static  String reverseString(String str){

        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+= str.charAt(i);

        }
        return reversed;
    }




    //2.


    public static void reverseArray(String str){



        String [] str2 = str.split(" ");

        String [] arr = new String[str2.length];
        for (String word: str2) {

            for (int i = word.length()-1; i >=0 ; i--) {

                System.out.print(word.charAt(i));
                
            }
            System.out.print(" ");


        }

    }


    public static void reverseNumbers(int num){

        String nums=num+"";
        String newStr="";


        for (int i = nums.length()-1; i >=0 ; i--) {

                newStr+=nums.charAt(i);

        }
        System.out.println(newStr);


    }

    
    
    
    
    
    
    public static int [] reverseIntArray(int [] nums){
        
        int [] newArr = new int[nums.length];

        int count=0;
        for (int i = nums.length - 1;    i >= 0; i--) {


            newArr[count]= nums[i];
           count++;

        }
        return newArr;



//        int[] newArr = new int[nums.length];
//        // int j=0; or inside if the loop statement;
//
//        for (int i = nums.length - 1, j=0;   i >= 0; i--, j++) {
//
//            newArr[j] = nums[i];
//
//        }
//        return newArr;

        
    }







}
