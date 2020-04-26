package java_questions;



public class MergeTwoString {


    public static void main(String[] args) {

        System.out.println(merge("Michael","213456789"));



    }




    public static String merge(String one, String two){

        int count =0;
        int minLength = 0;
        String result = "";

        if (one.length() > two.length()) {
            minLength = two.length();
        } else {
            minLength =  one.length();
        }
        while (minLength != count) {

            result +=  one.substring(count, count+1) + two.substring(count,count+1);

            count++;
        }
        if (one.length() == minLength) {
            result += two.substring(minLength);
        } else {
            result += one.substring(minLength);
        }
        return result;


    }




    public static String mergeStrings(String one, String two) {

        int count =0;
        int minLength = 0;
        String result = "";

        if (one.length() > two.length()) {
            minLength = two.length();
        } else {
            minLength =  one.length();
        }
        while (minLength != count) {

            result +=  one.substring(count, count+1) + two.substring(count,count+1);

            count++;
        }
        if (one.length() == minLength) {
            result += two.substring(minLength);
        } else {
            result += one.substring(minLength);
        }
        return result;

    }


}
