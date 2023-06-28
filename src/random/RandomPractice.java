package random;

import java.util.ArrayList;
import java.util.Random;

public class RandomPractice {



    public static void main(String[] args) {
        System.out.println(numbers(100));
         System.out.println(isEven(100));
        System.out.println(listOfEvenNumbers(100));
    }
    //Todo create a method that will return arraylist of numbers ,put the numbers with using random class until the given range
    public static ArrayList<Integer>numbers(int range){
        Random random=new Random();
        ArrayList<Integer>listOfnums=new ArrayList<>();
        for (int i=0;i<range;i++){
            listOfnums.add(random.nextInt(range));
        }
        return listOfnums;
    }
    //Todo write a program that will ask user to generate even  number
    public static boolean isEven(int num){
        Random random=new Random();
        int generatedNumber=random.nextInt(100);
        if(generatedNumber%2==0){
            System.out.println("the number you generated is even, generated  number is  : "+generatedNumber);
            return true;
        }
        else {
            //System.out.println("the number you generated is odd, generated  number is  : "+generatedNumber);
            return false;
        }
    }
    public static ArrayList<Integer>listOfEvenNumbers(int range){
        Random random=new Random();
        ArrayList<Integer>listofNums=new ArrayList<>();
        int count =0;       //10
        for (int i=0;i<range;i++){
            int randomNumber=random.nextInt(range);
            if(randomNumber%2==0){
                listofNums.add(randomNumber);
                count++;
            }else{
                // System.out.println("list is empty becaus the number generated is not even");
            }
        }
        System.out.println(count + ". times even number found in the iteration and your list of evennumber size is: " +count);
        return listofNums;
    }
















































}
