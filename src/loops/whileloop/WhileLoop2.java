package loops.whileloop;

import java.util.Scanner;

public class WhileLoop2 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");

        int number = input.nextInt();


        int startNumber = 0;


        while (startNumber <= number) {
            System.out.println(startNumber++);


        }




    }

}
