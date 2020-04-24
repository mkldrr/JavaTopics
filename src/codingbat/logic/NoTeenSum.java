package codingbat.logic;

public class NoTeenSum {



//
//    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive
//    -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)" +
//        " {"that takes in an int value and returns that value fixed for the teen rule. In this way,
//    you avoid repeating the teen code 3 times (i.e. "decomposition").
//    Define the helper below and at the same indent level as the main noTeenSum().


//    noTeenSum(1, 2, 3) → 6
//    noTeenSum(2, 13, 1) → 3
//    noTeenSum(2, 1, 14) → 3



    public int noTeenSum(int a, int b, int c) {

        if ( (a < 13 && a >19) && (b < 13 && b >19) && ( c < 13 && c >19) ){

            return a+b+c;
        }else if ((a < 13 && a >19) && (b >= 13 && b <=19) && ( c < 13 && c >19)){
            return a+c;
        } else if ((a < 13 && a >19) && (b < 13 && b >19) && ( c >= 13 && c <=19)){

            return a+b;
        }else if ((a >= 13 && a <=19) && (b < 13 && b >19) && ( c < 13 && c >19)){
            return c+a;
        }else if ((a < 13 && a >19) && (b >= 13 && b <=19) && ( c >= 13 && c <=19)){
            return a;

        } else if ((a >= 13 && a <=19) && (b < 13 && b >19) && ( c >=13 && c <=19)){

            return b;
        }else if ((a >= 13 && a <=19) && (b >= 13 && b <=19) && ( c < 13 && c >19)){
            return c;
        }else{
            return 0;
        }



    }



    public int fixTeen(int n){

        if (n==15 || n == 16){
            n=0;
        }
        return n;

    }


}
