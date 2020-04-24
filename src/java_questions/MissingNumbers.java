package java_questions;

import java.util.Arrays;

public class MissingNumbers {


    public static void main(String[] args) {



        int [] arr = {4,6,2,7,35,32,8};

        System.out.println(missingNumbers(arr));

    }












//todo : write a String return type method that will accept an int array, find the missing numbers in the given array


    public static String missingNumbers(int [] arr){

        String missing ="";
        Arrays.sort(arr);

        for (int i = 0; i < arr[arr.length-1]; i++) {   //[0 1 2 3 4 5 6 7]
            boolean check =true;
            for (int j = 0; j <arr.length ; j++) {  // [ 2,5,7]

                if (i==arr[j]){
                    //count++;  //1
                    check=false;
                }
            }
            if (check==true){

                missing+= i + " "; //0,1,
            }

        }



        return missing;
    }


    //todo








}
