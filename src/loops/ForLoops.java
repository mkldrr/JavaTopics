package loops;

public class ForLoops {


    public static void main(String[] args) {


        String name = "Michael";
        for (int i = 1; i <name.length() ; i++) {

            System.out.println(name.charAt(i));

        }

        String str="James";
        String s="";
        int count=0;
        System.out.println(str.indexOf("s"));
        for (int i = 0; i <str.length(); i++) {
            //System.out.println(str.substring(i));
            // System.out.println(str.substring(i-count));// i ==0 , 0, 0,
            System.out.println(str.substring(i,i+1));// 0,1 =J |  1,2=a | 2,3=m | 3,4=e | 4,5=s
            s+=str.substring(i,i+1);
            // count++;//1,2
            //System.out.println(str.charAt(i));
        }
        System.out.println(s);


    }

}
