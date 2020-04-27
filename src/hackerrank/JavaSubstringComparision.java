package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class JavaSubstringComparision {









//    We define the following terms:
//
//    Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
//    For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
//
//    A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
//    Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
//
//            Input Format
//
//    The first line contains a string denoting .
//    The second line contains an integer denoting .
//
//            Constraints
//
//    consists of English alphabetic letters only (i.e., [a-zA-Z]).
//    Output Format
//
//    Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
//
//    Sample Input 0
//
//    welcometojava
//3
//    Sample Output 0
//
//    ava
//            wel
//    Explanation 0
//
//    String  has the following lexicographically-ordered substrings of length :
//
//    We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
//
//    The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

    public static void main(String[] args) {


        System.out.println(getSmallestAndLargest("Michael",2));




    }





    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzzzzzzzzzzzzzzzzzz";
        String largest = "AAAAAAAAAAAAAAAAA";



        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
       // ArrayList<String> list = new ArrayList<>();

        if (s.matches("^[a-zA-Z]*$") && s !=null && !s.equals("")){

            for (int i = 0; i <s.length()-k+1 ; i++) {

                if (smallest.compareTo(s.substring(i,i+k) )>0){
                    smallest= s.substring(i,i+k);
                }

                if (largest.compareTo(s.substring(i,i+k))<0){
                    largest=s.substring(i,i+k);
                }

            }
        }



        return smallest + "\n" + largest;
    }
}
