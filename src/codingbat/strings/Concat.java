package codingbat.strings;

public class Concat {


    public static void main(String[] args) {


        System.out.println(conCat("abc","cat"));


    }

    public  static  String conCat(String a, String b) {
        String c="";

        int maxLength= 0;

        if (a.length()>b.length()) {
            maxLength = a.length();
        }else {
            maxLength=b.length();
        }
        for (int i = 0; i <maxLength ; i++) {

            if (a.charAt(i)+"" !=(b.charAt(i)+"")){
            }


        }
        return c;
    }
}
