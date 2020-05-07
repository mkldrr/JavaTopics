package java_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {





    // 20) How to check if two strings are anagram?

    public static void main(String[] args) {

        System.out.println(isAnagram("listenp","silentu"));


        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        one.add("mon"); one.add("omn");
        two.add("kite"); two.add("ietk");


        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(one); list.add(two);
        System.out.println(totalNumberOfAnagram(list));
        System.out.println();


        String [] rr = { "listen" , "book", "linest", "adf","nelist"};
        String word = "silent";

        //  word.contains("t");
        System.out.println(Arrays.toString(findAnagram(word,rr)));



    }

    public static boolean isAnagram(String str1,String str2){
        char []arr=str1.toCharArray();
        char []arr2=str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        boolean check= Arrays.equals(arr,arr2);
        return check;


    }


    public static boolean isAnagramTwo(String str1,String str2){

        if(str1.length()!=str2.length()) {
            return false;
        }
        else {

            int count=0;

            for (int i = 0; i < str1.length(); i++) {      //   "listen"; i = l

                for (int j = 0; j <str2.length() ; j++) {  // "silent"; j= s,i,l, e

                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        str2 = str2.substring(0, j) + str2.substring(j + 1);    // si +  ent
                        break;
                    }
                }

            }

            if (count == str1.length()) {
                return true;
            }
            return false;
        }


    }




    public static int totalNumberOfAnagram(ArrayList<ArrayList<String>> words) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            char[] firstStr = words.get(i).get(0).toCharArray();
            char[] secondStr = words.get(i).get(1).toCharArray();
            Arrays.sort(firstStr);
            Arrays.sort(secondStr);
            if (Arrays.equals(firstStr, secondStr)) count++;
        }
        return count;


    }




    public static String[] findAnagram(String word, String[] array) { //silent    madam,  [""michael","listenfdjd", "linest"]


        ArrayList<String> listOfAnagram= new ArrayList<>();


        for (int i = 0; i <array.length ; i++) {
            int count =0;

            for (int j = 0; j <array[i].length() ; j++) {

                if (word.contains(array[i].charAt(j)+"")){
                    count++;
                }
            }
            if (count==word.length() && array[i].length()==word.length()){
                listOfAnagram.add(array[i]);
            }
        }
        String [] arr= new String[listOfAnagram.size()];
        arr= listOfAnagram.toArray(arr);
        return arr;
    }


}
