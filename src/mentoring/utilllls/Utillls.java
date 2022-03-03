package mentoring.utilllls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utillls {


    public static String createEmail(String firstName, String lastName){

        return firstName + "."+lastName +"@gmail.com";



    }


    //Todo: Create a Login class  which will have username, password, age  variables;

    // condition: create a method inside of Login class. This method will take tree params.
    // if username length is more than 10, user can login, if users password has to have  a number,
    // and user should be more then 18 years old.
    // uppercase, and min 10 length


    public static void logging(String userName, String password, int age){


        boolean isNum=false;

        if ( (userName.length()>10 && password.length()> 10) && age >18){
            for (int i = 0; i <password.length()-1 ; i++) {
                if (Character.isDigit(password.charAt(i))){
                    isNum=true;
                }else {
                }
            }
            if (isNum==true ){
                System.out.println("You are successfully logged in");
            }else{
                System.out.println("pls check password, it should include digit ");
            }
        }
        else {

            System.out.println("check your password, age or username");
        }


    }





   //  "ab234567"

    public static int firstDigit(String keyword){
        boolean check = false;
        int num =0;
        for (int i = 0; i <keyword.length() ; i++) {
            if (Character.isDigit(keyword.charAt(i))){
               if ( (Integer.parseInt(String.valueOf(keyword.charAt(i)))==1 )|| ( Integer.parseInt(String.valueOf(keyword.charAt(i)))==2 ) ){

                   return Integer.parseInt(String.valueOf(keyword.charAt(i)));
               }
            }
         }
        return 0;
    }
    public static void main(String[] args) {
        // TODO 1: this is for above method if we dont know where the index of digits
        System.out.println( firstDigit("mm288767788978789"));




        //TODO 2:
        // This is another way to solve the problem if we know the first digit is always in the 2nd index,
        // then we can directly go to 2nd index and get the value and return as integer
        String example = "mm845787698";
        int num3= Integer.parseInt(String.valueOf(example.charAt(2)));
        System.out.println(num3);
    }











}
