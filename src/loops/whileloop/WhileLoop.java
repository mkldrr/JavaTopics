package loops.whileloop;

import java.util.Scanner;

public class WhileLoop {


    //there is boolean statement inside of the while, until it becomes false, it will iterate.








    public static void main(String[] args) {


//        String name2 = "Michael";
//        System.out.println(name2.startsWith("M"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//
//        String name = scanner.nextLine();
//
//        while (name.startsWith("j")) {
//            System.out.println("enter your name: ");
//            name = scanner.nextLine();
//        }



        Scanner input = new Scanner(System.in);

        System.out.println("would you like to add ? ");

        String userentry =input.nextLine();


        int num = 0;

        while (userentry.equals("yes") || userentry.equals("y")) {
            num++;
            System.out.println("Would you like to add 1 ?");
            userentry = input.nextLine();
        }
        System.out.println("your number is: " + num);
    }
}
