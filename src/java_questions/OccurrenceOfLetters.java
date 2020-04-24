package java_questions;

import java.util.HashMap;

public class OccurrenceOfLetters {

    public static void main(String[] args) {

        String sentence= "abrakadabra";

        occurrenceOfLetters(sentence);

        int [] arr= {2,13,4,1,1,4,1,2,2,4,2,5,1};

        System.out.println(occurrenceOfLetters2(sentence));
        System.out.println(occurrenceOfNumbers(arr));


    }







    public  static void occurrenceOfLetters(String sentence){

        String checked="";
        int count=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if (!checked.contains(sentence.charAt(i)+"")){
                for (int j = 0; j <sentence.length() ; j++) {
                    if (sentence.charAt(i)==sentence.charAt(j)){
                        count++;
                    }
                }
                checked+= sentence.charAt(i)+" ";
                System.out.println(sentence + " =  has " + count + " times " + sentence.charAt(i) );
                count=0;
            }
        }

    }





    public static HashMap<Character, Integer> occurrenceOfLetters2(String sentence){
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : sentence.toCharArray()) {

            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        return map;
    }


    public static HashMap<Integer, Integer> occurrenceOfNumbers(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i <arr.length ; i++) {

            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{

                map.put(arr[i],map.get(arr[i])+1);
            }
            
        }
        return map;
    }


}
