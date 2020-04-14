package scanner;

import java.util.Scanner;
public class ScannerPractice {


    public static void main(String[] args) {


        //TODO : Write a program that ask user to enter only numbers,
        // if it is not a number, program should ask it is an in valid entry, please enter only number



//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//
//          int number= input.nextInt();
//        try {
//        if (Character.isDigit(number)) {
//
//        System.out.println("it is an in valid entry, please enter only number");
//
//        } else {
//
//        input.nextInt();
//
//         }
//
//        }catch (Exception e){
//        System.out.println(e.fillInStackTrace());
//        }
//



//TODO write a program that prints today's date from the user, you should day, month  and year print in the following format 05/06/2020

//        System.out.println("Enter a date");
//        String date=input.nextLine();
//        System.out.println("Enter the month");
//        String month=input.nextLine();
//        System.out.println("Enter the year");
//        String year=input.nextLine();
//        System.out.println(date+"/"+month+"/"+year);

      //  Scanner scanner = new Scanner(System.in);
        System.out.println("how many time you want to enter a number ");

       // int numberOfEntery= scanner.nextInt();


//        for (int i =0; i< numberOfEntery; i++ ){
//
//            System.out.println("enter a number ");
//
//             scanner.nextInt();
//
//            if (numberOfEntery<10){
//
//                System.out.println();
//
//
//            }



            for (int i =0; i<= 20; i++) {

                if (i == 10) {
                    continue;
                }

                System.out.println(i);

        }


    }


}
