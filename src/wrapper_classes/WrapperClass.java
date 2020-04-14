package wrapper_classes;

public class WrapperClass {

    public static void main(String[] args) {


        Integer num = 456;
        int n = 11;

        System.out.println(num);
        System.out.println(n);

        //autoboxing
        // num=n;
        System.out.println(num);

        //unboxing

        n = num;
        System.out.println(n);


        Integer myint = 10078888;
        String mystring = myint + "";
        System.out.println(mystring.length());

        int i = 35;
        Integer i2 = new Integer(35);
        System.out.println(i);
        System.out.println(i2); // is object type now
        Integer age = 26;
        System.out.println(age);

        Integer ii = i;


    }
}
