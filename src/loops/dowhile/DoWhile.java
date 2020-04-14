package loops.dowhile;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {



//        int num=1;
//
//        do {
//
//           ++ num;//1,2,3,4
//            System.out.println(num);//1,2,3
//        } while (num<=10);






//    Generate a random number from 1 to 100. Ask the user to guess the number.
//    If the guess is too high print "Too high" If the guess is too low print "Too low".
//    They continue to guess until they guess the correct number.
//    Count how many guesses were taken and when the number is
//    guessed correctly print "You guessed right after guessValue tries !
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int generatedNum=random.nextInt(100);  //89
        int guessedNum=0;
        int count=0;
        do {
            System.out.println("Guess the number");
            guessedNum=scanner.nextInt();  //65
            count++;//my first guesss
            if(guessedNum>generatedNum){
                System.out.println("Too high guess");
            }
            else if(guessedNum<generatedNum){
                System.out.println("Too low guess");
            }
            else {
                System.out.println("You guessed right after " + count+" tries !");
            }

        }
        while (guessedNum!=generatedNum);







    }
}
