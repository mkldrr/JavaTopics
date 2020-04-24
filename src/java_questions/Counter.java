package java_questions;

public class Counter {


    public static void main(String[] args) {
        String name = "Maiachaaelak";
        System.out.println(countChar(name));
    }
    public static int countChar(String str){
        int count =0;
        boolean check = false;
        for (int i = 0; i <str.length() ; i++) {
            check = false;
            if (str.charAt(i)=='a'){
               check = true;
               if (check){
                   count++;
               }
            }
        }
       return count;
    }
}
