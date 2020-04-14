package arraylist;

import java.util.ArrayList;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("HG");
        names.add("AAABJHkbjjjjjjttttttttttttjjaaaaaaaaah");
        names.add("HGJguiuhoiuokjkjlklkl");
        names.add("ighhhhjjjjj");
        names.add("HGJguiuhoiuo");
        names.add("dfdg");
        // System.out.println(printLongestNamefromList(names));
        System.out.println(removeTheshortestName(names));
    }

    public static String printLongestNamefromList(ArrayList<String>names){
        String longName="";
        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i).length()>longName.length()){
                longName=names.get(i);
            }
        }
        return longName;
    }

    public static ArrayList<String > removeTheshortestName(ArrayList<String> name){

        String shortestName= name.get(0);
        for (int i = 0; i < name.size(); i++) {    // [sdfgrftgh,werty,wefhjklnmrt,wefgrthyu,efrsgthyrfghty,er]
            if(name.get(i).length()< shortestName.length()){
                shortestName =name.get(i);
            }
        }
        name.remove(shortestName);
        return name;
    }





}










