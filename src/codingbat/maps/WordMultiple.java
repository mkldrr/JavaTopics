package codingbat.maps;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {


    public static void main(String[] args) {

        String [] strings= {"a", "b", "a", "c", "b"};


        System.out.println(wordMultiple(strings));
    }

//    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}


    public static Map<String, Boolean> wordMultiple(String[] strings) {


        Map<String, Boolean> words = new HashMap<>();


        for (String s: strings) {


            if (!words.containsKey(s)){

                words.put(s,false);
            }else {
                words.put(s, true);
            }

        }

//        int count=0;
//        boolean b=false;
//        for (int i = 0; i <strings.length-1 ; i++) {
//            count=0;
//            for (int j = i+1; j <strings.length ; j++) {
//                if (strings[i].equals(strings[j])){
//                        count++;
//
//
//                }
//                if (count>=2){
//                    words.put(strings[i], true);
//
//                }else {
//                    words.put(strings[i],false);
//                }
//            }
//
//        }
     return words;

    }
}
