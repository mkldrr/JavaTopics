package java_questions;

public class SumOfDigits {



//    11 - Write a method that will accept a string and return sum of numbers in a string.
//    Input: "I5 a3m an Soft9ware 2 Develop3er in wrapper_classes.Test" output: 5 + 3 + 9 + 2 + 3 = 22 (Got this question in Here)


    public static void main(String[] args) {


        String sentence= "I5 a3m an Soft9ware 2 Develop3er in wrapper_classes.Test";
        System.out.println(sumOfDigits(sentence));


    }




    public static String sumOfDigits(String sentence){

        String digits="";
        int sum=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if (Character.isDigit(sentence.charAt(i))){

                sum+=Integer.parseInt(sentence.charAt(i)+"");
                digits += sentence.charAt(i)+" + ";
            }
        }
        return digits.substring(0,digits.length()-2) + " = " + sum;
    }
}
