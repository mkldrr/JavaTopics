package mentoring.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeQuestions {
//    Create a method that will return an ArrayList < String > . (you can decide the method name )
//    This method will have 1 parameter (String word ){
//        let’s say word is: “Michael”; ( you can decide the keyword by yourself.
//        Return an arrayList string with every letter of the name like { “M” , “i”, “c” , “h” , “a” , “e” , “l”}
//    }
    public static void main(String[] args) {


        //System.out.println(letterArrayList("Michael"));


        int [] arr= {23,37,46,38,27,20,9,2 };








     //   System.out.println(evenNumbers(arr));
      //  System.out.println(oddNumbers(49));


        System.out.println(oddNumbers(arr));


        // > 38, 20, 20

        // > 38

        // > 38, 20, 2

        // > 38, 20, 2
        // > 0,2 4, 6

        // > 3, 5, 7
        // > 4, 6, 9

    }



    public static ArrayList<String> letterArrayList(String name){
        ArrayList<String> letters= new ArrayList<>();

        for (int i = 0; i <name.length() ; i++) {

            letters.add(String.valueOf(name.charAt(i)));
        }
        return letters;
    }

    //TODO: Create a method which will return an  Integer ArrayList. The method will accept an int array parameter.
    // Return every even number which are in the Array.

    public static ArrayList<Integer> evenNumbers(int [] arr){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
     //   [  23,37,47,38,27,20,9,2  ]
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0) evenNumbers.add(arr[i]);
        }
        return evenNumbers;
    }
    public static ArrayList<Integer> oddNumbers (int num){

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i <= num ; i++) {
            if (i%2==1) oddNumbers.add(i);
        }
        return oddNumbers;
    }






//TODO: Create a method which will return an integer (return type). This method will have an int array parameter.
// Return the number from that array which is the second highest num.



    //TODO     arr=  [ 2, 5, 7, 37, 458, 346,223]

   //     int highest= arr[1]
    // int sHigh; [1]




    public static int secondMaxNumber(int []arr){

        int max=arr[1];

        int secondMax=arr[1];

//TODO     arr=  [ 2, 5, 7, 37, 458, 346,223]

        for (int i = 0; i <arr.length ; i++) {            // arr [i] : 2: max 458  second : 346
            if (arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            if (arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }





    //11/2 = 1



    //TODO Create a method which will Find odd numbers from array and put them in the map one by one  and return as a map type

    public static HashMap<Integer, Integer> oddNumbers(int [] arr){

        HashMap<Integer, Integer> map= new HashMap<>();
        int key=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==1) map.put(key++, arr[i]);
        }
        return map;
    }
}














        // TODO: Switch two integer variable  without creating a third variable.


// int num = 3
// int num2 = 5

// num will become 5;
// num2 will become 3;



//TODO:















































