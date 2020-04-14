package collection_framework.sets;

import java.util.*;

public class SetPractice {




    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);
        numbers.add(19);
        numbers.add(7);
        numbers.add(4);
        numbers.add(11);
        numbers.add(90);
        // System.out.println(numbers.size()+ " This is the size of list");
        // System.out.println(nonDublicate(numbers));

        Set<Integer> setOfNum=new HashSet<>();
        setOfNum.add(24);
        setOfNum.add(65);
        setOfNum.add(76);
        setOfNum.add(22);
        setOfNum.add(60);
        setOfNum.add(77);
        setOfNum.add(11);
        setOfNum.add(88);
        setOfNum.add(5);
        setOfNum.add(2);
        setOfNum.add(1);

        //System.out.println(setOfNum.size());
        //System.out.println(printEvenNumbers(setOfNum));
        HashSet<Integer>numbersOfSet=new HashSet<>();

        numbersOfSet.add(24);
        numbersOfSet.add(65);
        numbersOfSet.add(76);
        numbersOfSet.add(22);
        numbersOfSet.add(60);
        numbersOfSet.add(77);
        numbersOfSet.add(11);
        numbersOfSet.add(88);
        numbersOfSet.add(5);
        numbersOfSet.add(2);
        numbersOfSet.add(1);
        // System.out.println(printOddandBigger10(numbersOfSet));

        HashSet<String>setOfNames=new HashSet<>();
        setOfNames.add("Adil");
        setOfNames.add("Alllllllellllellellellzx");
        setOfNames.add("Gkjkjfslwqoiqowioi");
        setOfNames.add("GJHaqq");
        setOfNames.add("Adilsaaaa");
        setOfNames.add("Allllsssssslllellllellellellzx");
        setOfNames.add("DdGkjkjfslwqoiqowioi");
        setOfNames.add("GJHaqqa");
        setOfNames.add("hfzst");


        // System.out.println(setNamesWithoutA(setOfNames));

        String target="Adil";
        //System.out.println(printUniqueCommonNames(setOfNames,target));

        HashSet<String>setOfNames2=new HashSet<>();
        setOfNames2.add("Adil");
        setOfNames2.add("KAlllllllellllellellellzx");
        setOfNames2.add("aGkjkjfslwqoiqowioi");
        setOfNames2.add("AGJHaqq");
        setOfNames2.add("Adilsaaaa");
        setOfNames2.add("kAllllsssssslllellllellellellzx");
        setOfNames2.add("hhDdGkjkjfslwqoiqowioi");
        setOfNames2.add("GJHaqqa");
        setOfNames2.add("hfzst");

        System.out.println(commonNames(setOfNames,setOfNames2));



    }

    public static Set<Integer>nonDublicate(ArrayList<Integer>listOfnumbers){

        Set<Integer>setOfnumbers=new HashSet<>();

        for (int i = 0; i < listOfnumbers.size(); i++) {

            setOfnumbers.add(listOfnumbers.get(i));

        }
        return setOfnumbers;
    }

    public static ArrayList<Integer> printEvenNumbers(Set<Integer>setOfNumbers){

        ArrayList<Integer>listOfevenNumbers=new ArrayList<>();
        List<Integer>listOfSet=new ArrayList<>(setOfNumbers);
        for (int i = 0; i <listOfSet.size() ; i++) {
            if (listOfSet.get(i)%2==0){
                listOfevenNumbers.add(listOfSet.get(i));
            }
        }
        return listOfevenNumbers;
    }

    public static HashSet<Integer> printOddandBigger10(HashSet<Integer>setOfnumbers){

        HashSet<Integer>numbersOfHashset=new HashSet<>();

        Iterator<Integer> iterator=setOfnumbers.iterator();

        while (iterator.hasNext()){

            int num = iterator.next();
            if (num%2==1 && num>10){

                numbersOfHashset.add(num) ;
            }

        }

        return numbersOfHashset;
    }

    public static HashSet<String>setNamesWithoutA(HashSet<String>setOfnames){

        Iterator<String>iterator=setOfnames.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            if(str.contains("A") && str.length()>10){

                iterator.remove();
            }
        }
        return setOfnames;
    }

    // set of names [mkl,sdhukj,sjhdgcvjh,sdjhgfsdjh] str= "mkl"

    public static HashSet<String>printUniqueCommonNames(HashSet<String>setOfnames,String targetName){
        HashSet<String>setOfCommonNames=new HashSet<>();

        List<String>listOfset=new ArrayList<>(setOfnames);   // [kdb,jshd,sjhc,sjhdv,sjdhgf] //kdb

        for (int i = 0; i <listOfset.size() ; i++) {
            if ( !listOfset.get(i).equals(targetName)) {
                for (int j = 0; j < targetName.length(); j++) {

                    if (listOfset.get(i).contains(targetName.charAt(j)+"")) {

                        setOfCommonNames.add(listOfset.get(i));
                    }

                }

            }
        }

        return setOfCommonNames;
    }



    public static String commonNames(HashSet<String> setOfNames, HashSet<String>setOfNames2){

        String str="";
        List<String > listOfNames1=new ArrayList<>(setOfNames);
        //  List<String>listOfNames2=new ArrayList<>(setOfNames2);

        for (int i = 0; i < listOfNames1.size(); i++) {


//            for (int j = 0; j <listOfNames2.size() ; j++) {
//
//                if(listOfNames1.get(i).equals(listOfNames2.get(j))){  // set1 [mkl....]  --- set2 [mkl ....]
//
//                    str+=listOfNames1.get(i)+" ";
//                }
//            }

            if (setOfNames2.contains(listOfNames1.get(i))){
                str+= listOfNames1.get(i) +", ";
            }

        }

        return str.substring(0,str.length()-2);

    }

//GJHaqqa hfzst Adil Adilsaaaa

}
