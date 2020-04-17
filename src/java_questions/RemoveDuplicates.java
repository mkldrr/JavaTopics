package java_questions;

import javax.xml.stream.XMLInputFactory;
import java.util.ArrayList;

public class RemoveDuplicates {

//    6-) Remove Duplicates from Array
//    Create a method that will accept an int array. Return an int arrayList with only nonDuplicates values.
//    If there is a duplicate element, only include one instance of that element.
//    Ex:
//    > input: 2,3,1,1,3,5,2,6,4 > output: [2, 3, 1, 5, 6, 4]


    public static void main(String[] args) {

        int [] arr = {1,3,3,3,3,5,79,57,68,79,43,57,31,1,13}; //5 , 68, 43, 31, 13

        System.out.println(removeDuplicates(arr));

    }
    public static ArrayList<Integer> removeDuplicates(int [] arr){

        ArrayList<Integer> removeDuplicatesList= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!removeDuplicatesList.contains(arr[i])){
                removeDuplicatesList.add(arr[i]);
            }
        }
        return removeDuplicatesList;


    }


}
