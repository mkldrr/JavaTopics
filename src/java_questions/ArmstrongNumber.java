package java_questions;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(1553));




    }













//Todo    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number
//    or false if it is not — Armstrong number is a number that will take each digit of the number and raise it to the power of the number’s length.
//    Then the results of each operation will be added together. The final result of all the operations will be equal to
//    the original number for an Armstrong number.
//    *** In our case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
//    Ex:
//  > input: 153 1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153 > output: true



    public static boolean isArmstrong(int num ){

        String number= num+"";
        int sum = 0;
        int power = number.length();
        for (int i = 0; i <power ; i++) {
            int digit = Integer.parseInt(number.charAt(i)+"");
            sum+= Math.pow(digit,power); //);//(digit*power)  + (digit*power)+ (digit*power);
        }
        return sum==num;

    }
}
