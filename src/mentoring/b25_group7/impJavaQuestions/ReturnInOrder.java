package mentoring.b25_group7.impJavaQuestions;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnInOrder {


    public static void main(String[] args) {


        String [] arr = {"White", "Red", "Blue", "Blue", "Red", "Red", "White" , "Blue", "Red" };

        System.out.println(Arrays.toString( returnInOrder(arr)));
    }





    public static String [] returnInOrder(String [] arr){

        String [] colorArr = {"Red","White", "Blue"};
        int [] colorCount = {0,0,0};

        String [] newArr = new String [arr.length];


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals("Red")){
                colorCount[0]++;
            }else if (arr[i].equals("White")){
                colorCount[1]++;
            }else {
                colorCount[2]++;
            }
        }
        int count = 0;
        for (int i = 0; i < colorCount.length ; i++){

            for( int j = 0; j < colorCount[i] ; j++) {
                newArr[count]=colorArr[i];
                count++;
            }
        }

        return newArr;


    }
}
