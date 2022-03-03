package arraylist;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        //1.add method: it is ading an element to the end of the list
        list.add(233);
        list.add(90);
        list.add(2355);
        System.out.println(list);

        //specific add method it acepts integer index and value and move
        list.add(1,120);
        System.out.println(list);
        //set method:is overwrites the value at the given index
        list.set(1,11);
        System.out.println(list+"  set ");///it is gonna set instead of the given index value

        //2. get method: it returns an element at the specified position
        System.out.println(list.get(2));

        //3 contains method : is returns true if the element in this list ,otherwise retuns false
        System.out.println(list.contains(90)+ " :contains method");
        //4.indexOf method: accepts object element ,returns the index of the first  occurence of the elelment inthis list

        System.out.println(list.indexOf(90)+ "  : indexOf method");

        //5.size method: returns the number of the element
        System.out.println(list.size()+ " : size method");

        //6.remove method: it acepts int index ,and removes the element at the specified index of this list
        System.out.println(list.remove(0)+ " : remove method");
        System.out.println(list);

        //isEmpty method : returns true or false
        System.out.println(list.isEmpty()+ " : isEmpty method");

        //clear method: removes all the elements from the list
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());




    }
}
