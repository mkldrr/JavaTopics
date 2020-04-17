package java_questions;

public class FindSecondMaxNumber {


    public static void main(String[] args) {





        int [] arr= {0,43,25,26,2345,876,235,8765,2};

        System.out.println(secondMaxNumber(arr));
    }









//    5-) Find Second Max Number
//    Create a method that will accept an int array. Return the number which is the second to biggest number./
//            ** Do not use sort method *   Ex:     > input: 1,3,22,44,12,30,32,54,31 > output: 44




    public static int secondMaxNumber(int []arr){

        int max=arr[1];

        int secondMax=arr[1];


        for (int i = 0; i <arr.length ; i++) {
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

}
