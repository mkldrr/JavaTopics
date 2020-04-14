package collection_framework.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {


    public static void main(String[] args) {

        String [] arr= {"a", "bb", "a", "bb"};

        System.out.println(wordLen(arr));

    }

    public static Map<String, Integer> wordLen(String[] strings) {


        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<strings.length; i++){

            map.put(strings[i],strings[i].length());

        }

        return map;

    }

//    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
//
//
//    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//    pairs(["man", "moon", "main"]) → {"m": "n"}
//    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

    public Map<String, String> pairs(String[] strings) {


        Map<String,String> map = new HashMap<>();

        for(int i=0; i<strings.length; i++){

            map.put(strings[i].charAt(0)+"",strings[i].substring(strings[i].length()-1)); // [ "Michael"

        }

        return map;

    }


}
