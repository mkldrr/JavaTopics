package if_statements;

public class IfStattementPractice {

//    If else some code to execute when it is true
//
//            . condition must be a statement that returns boolean datatype
//
//    If can take multiple statement inside of it .



    public static void main(String[] args) {


        String name = "Michaelmkldrrr";

//        if (name.length()<10){
//
//            System.out.println("your name length is less than 10: because your name length is: "+ name.length());
//        }else{
//
//            System.out.println("your name is: " + name + " length is: " + name.length());
//        }



        // nested

//        if (name.length()>10){
//
//            if (name.length()%2==0){
//
//                System.out.println("your name is: " + name + " and your name length is even, when you divide, remainder is 0; perfect name" );
//            }else {
//
//                System.out.println("your name is not even when you divide by 2, but length it more than 10: lenght is " + name.length());
//            }
//
//        }else {
//
//            System.out.println(" your name length is not more than 10; the length is:  " + name.length() );
//
//        }

        int count =0;
        int count2=0;
        for (int i =0; i<name.length()-1; i++){
            if (name.substring(i,i+2).equals("Mi")){     // 0,1 == m  ;   1,2 = i; -------
                count2++;
            }
        }
       // System.out.println("you have   "+count + " times 'r' in your name ");
        System.out.println("you have   "+count2 + " times 'Mi' in your name ");


    }
}
