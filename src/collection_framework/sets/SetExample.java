package collection_framework.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {


    //    Set is an interface which extends Collection. It is an unordered collection of objects
//    in which duplicate values cannot be stored.
//    Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
//    Set has various methods to add, remove clear, size, etc to enhance the usage of this interface

//    Set: it is unordered, there is no indexes. It does not allow duplicates.
//
//—   the only way to store elements in order as Set, it is to convert to ArrayList constructor.
//
//    Ex: List<String> list = new ArrayList(cars);
//
//—Read from Set—
//
//            —Because set is unordered, there is no indexes, which means there is not get method.
//—Looping through a set: For-Each Loop is used to read elements, so if you want to change the elements in
// your Set, you CANNOT use for for each loop.
//
//            —>if you try to use the loop to change the set, you will get ConcurentModificationException, which is thrown because you tried to change the size of the set and loop is confused.
//
//—     To avoid this exception, Iterator (Interface) in order to loop = is used.


    public static void main(String[] args) {

        Set<String> names=new HashSet<>();
        names.add("Manat");
        names.add("Zuura");
        names.add("Luna");
        names.add("Rita");
        //  System.out.println(names.size());
        // System.out.println(names);

        for (String str:names) {
            if (str.length() > 4) {
                //System.out.println(str);
            }
        }

        //remove method

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int totalSize=scanner.nextInt();

        Set<Integer>set=new HashSet<>();

        for (int i=0;i<totalSize;i++){
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            set.add(num);
        }
        //  System.out.println(set);


        Iterator<Integer> iterator=set.iterator(); //
        // System.out.println(iterator);
        while(iterator.hasNext()){

            int num2 = iterator.next();
            if (num2%2==1){
                iterator.remove();
            }
        }
        System.out.println(set);

    }
}
