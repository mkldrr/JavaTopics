package mutable_immutable;

public class Immutable {


    public static void main(String[] args) {
        String name="Alexandr";
        StringBuilder sb=new StringBuilder(name);

        //1 append: concatination takes string or number
        sb.append(" Bond");
        System.out.println(sb+ " : append");
        //2 deleteCharAt : will delete specific charackter based on the index provided
        sb.deleteCharAt(1);
        System.out.println(sb+ " :deleteCharAt");
        //3 delete

        //reverse will reverse the characters
        //sb.reverse();
        //System.out.println(sb+ " : reverse");

        //insert will add the given String into the given index,takes int and String

        sb.insert(1,"Mel");
        System.out.println(sb+ " : insert");

        //delete ( ): will delete characters in the range of the indexes provided.
        ////            —takes, two numbers

        sb.delete(1,3);
        System.out.println(sb+ " :delete");

    }
}
