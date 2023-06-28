package wrapper_classes;

import arraylist.Arraylist;
import wrapper_classes.InterviewBit;

import java.util.ArrayList;

public class Test {




    public int num1;
    static int num2;


//    public static void main(String args[]) {
//        InterviewBit obj1 = new InterviewBit();
//        InterviewBit obj2 = new InterviewBit();
//        obj1.num1 = 0;
//        obj1.num2 = 0;
//        obj1.calculate(1, 2);
//        obj2.num1 = 0;
//        obj2.calculate(2, 3);
//        System.out.println(obj1.num1 + " " + obj2.num2);
//    }
//


    public static void main(String[] args) {


        int [] arr = {3,7,6,9,4,8,12,6,9};

        System.out.println( returnEvenNums(arr));
    }




    //TODO: Create a method which will return an int ArrayList. This method will find the even numbers
    // from the given int Array param



    public static ArrayList<Integer> returnEvenNums ( int [] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {    // [ 3.7.6.9.4.8.12.6.9.]
                                            // i= 0 , 1, 2
                                            // arr[i] The value= 3 , arr[1]= 7 , arr[2]=6
            if (arr[i] %2==0 ) {

                list.add(arr[i]);
            }

        }
        return list;

    }










}
