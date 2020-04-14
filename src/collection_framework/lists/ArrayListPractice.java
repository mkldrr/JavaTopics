package collection_framework.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<String>listOfnames=new ArrayList<>();
        String targetName="Alex";

        listOfnames.add("Car");
        listOfnames.add("Alex");
        listOfnames.add("Nurlan");
        listOfnames.add("Asel");
        listOfnames.add("Alex");
        listOfnames.add("Amina");
//        System.out.println(listOfnames.size());
        System.out.println(removeStr(listOfnames,targetName));
//        System.out.println(listOfnames.size());

        List<Integer> listOfNumbers=new ArrayList<>();

        listOfNumbers.add(1);
        listOfNumbers.add(54);
        listOfNumbers.add(15);
        listOfNumbers.add(4);
        listOfNumbers.add(17);
        listOfNumbers.add(34);
        System.out.println(listOfNumbers.size());
        System.out.println(printEvenandMore10(listOfNumbers));

















        String name="Nurl12l45bdnj";
        System.out.println(printDigits(name));

    }


    public static ArrayList<String> removeStr(ArrayList<String>listOfNames, String targetName){

        for (int i=0;i<listOfNames.size();i++){
            if(listOfNames.get(i).contains(targetName)){
                listOfNames.remove(listOfNames.get(i));
            }
        }
        return  listOfNames;
    }

    public static List<Integer> printEvenandMore10(List<Integer>numbers){

        List<Integer> number = new ArrayList<>();
        for (int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0 & numbers.get(i)>10){  // [ 2,6,12,88,32]

                number.add(numbers.get(i));
            }
        }
        return number;

    }
    public static List<Integer>printDigits(String str){

        List<Integer>listOfDigits=new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){

                listOfDigits.add(Integer.parseInt(String.valueOf(str.charAt(i))));  //"Mic123hael"

            }
        }
        return listOfDigits;
    }
}
