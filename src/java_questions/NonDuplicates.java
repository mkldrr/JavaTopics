package java_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonDuplicates {
    public static void main(String[] args) {
        int [ ] arr = {2,43,5,2,6,22,1,43,5};
        System.out.println(uniques(arr));
    }
    public static ArrayList<Integer> uniques(int [] arr){
        ArrayList<Integer> listOfUniqueNumbers= new ArrayList<>();//we will return arrayList
        Map<Integer, Boolean> map= new HashMap<>();// maps are about  key and values : keys are always unique and there cannot be duplicated key in maps.
        for (Integer number : arr) {   //2,43,5,2,6,22,1,43,5     map//    {6,false}, {22,false}, {{1,false},
            if (!map.containsKey(number)){
                map.put(number,true);
            }else{
                map.remove(number);
            }
        }
        for (Integer uniques: map.keySet()) {
            listOfUniqueNumbers.add(uniques);
        }
       return listOfUniqueNumbers;
    }
    public static ArrayList<Integer> printNonDuplicates(int[] arr) {
        ArrayList<Integer> listOfUniqueNumber = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {      ///2,7 43,5,2,6,22,1,43,5   : 7
            boolean check = true;
            for (int j = 0; j < arr.length; j++) {  // 2,7 43,5,2,6,22,1,43,5   : 2,7,
                if (arr[i] == arr[j] && i != j) {
                    check = false;
                }
            }
            if (check) {
                listOfUniqueNumber.add(arr[i]);
            }
        }
        return listOfUniqueNumber;
    }
}
