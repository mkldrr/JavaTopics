package java_questions;

import java.util.ArrayList;

public class Duplicates {


    public static void main(String[] args) {


        int [] arr = {1,1,3,4,1,4,4,3,6,8,3,3,3};

        System.out.println(printOneTimeDuplicates(arr));


    }

    public static ArrayList<Integer> printOneTimeDuplicates(int []arr){

            ArrayList<Integer> listOfDuplicated = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int count =0;
            boolean check = true;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j] && i!=j){
                    check=false;
                    count++;
                    if (!check && count==1){
                       if(!listOfDuplicated.contains(arr[i])){
                           listOfDuplicated.add(arr[i]);
                       }
                    }
                }
            }
        }
        return listOfDuplicated;

    }
}
