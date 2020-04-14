package loops;

public class NestedLoop {


    public static void main(String[] args) {


        //Todo

        String name= "Michaelllllll";

       // String name2="KobeBryant";

      //  int count =0;

        String unique="";

        for (int i = 0; i <name.length() ; i++) {

            int count=0;
                for (int j = 0; j <name.length() ; j++) {
                    if (name.charAt(i)==name.charAt(j)){    //i M       /J M , i
                        count++;
                        if (count==1){
                            unique+= name.charAt(i);
                    }
                    }
                }
        }
        System.out.println(unique);
    }
}
