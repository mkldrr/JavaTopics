package hackerrank;

import java.util.Scanner;

public class Anagram {


    static boolean isAnagram(String a, String b) {
        // Complete the function


        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length()!=b.length()) {
            return false;
        }
        else {

            int count=0;

            for (int i = 0; i < a.length(); i++) {      //   "listen"; i = l

                for (int j = 0; j <b.length() ; j++) {  // "silent"; j= s,i,l, e

                    if (a.charAt(i) == b.charAt(j)) {
                        count++;
                        b = b.substring(0, j) + b.substring(j + 1);    // si +  ent
                        break;
                    }
                }

            }

            if (count == a.length()) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
