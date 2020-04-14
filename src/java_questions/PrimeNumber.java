package java_questions;

import java.util.ArrayList;

public class PrimeNumber {



//    Prime numbers are divisible only by the number 1 or itself.
//
//    For example, 2, 3, 5, 7 and 11 are the first few prime numbers.
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(listOfPrimeNumbers(50));
    }
    public static ArrayList<Integer> listOfPrimeNumbers(int range){
        ArrayList<Integer> primeNumbersList= new ArrayList<>();
        for (int i = 1; i <=range ; i++) {
            if (isPrime(i)){
                primeNumbersList.add(i);
            }
        }
        return primeNumbersList;
    }
    //helper method
    public static boolean isPrime(int num){
        int count =0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                count++;
            }
        }
        if(count==2 ){
            return true;
        }else{
            return false;
        }
    }
}
