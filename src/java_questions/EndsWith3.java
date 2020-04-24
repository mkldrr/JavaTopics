package java_questions;

public class EndsWith3 {







   // 16.) Method takes and integer and prints a number that ends with 3 till that number. For ex: 3, 13, 23 ?

    public static void main(String[] args) {


        endWith3(99);


    }




    public static void endWith3(int number){
        for (int i = 0; i <=number ; i++) {
            if (i%10==3)
                System.out.println(i + " ");
        }
    }
}
