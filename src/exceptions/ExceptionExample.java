package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {




    public static ArrayList<Integer> inputmissMatch(){

        ArrayList<Integer>arrList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        for (;;){
            try {

                System.out.println("Enter the number");
                int num = scanner.nextInt();
                arrList.add(num);
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid entry ,please enter the number");
                e.printStackTrace();
                return arrList;
            }
        }


    }

    public static void main(String[] args) {

        System.out.println(inputmissMatch());
    }

}
