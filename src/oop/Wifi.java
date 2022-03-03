package oop;

public interface Wifi {


    //   Interface can only have abstract methods. And only public.
    //    All methods in the interface are public abstract by default.  But by making methods static, it becomes non-abstract class.
//            *3 Types of interface :
//            — public abstract method > has no body
//  —         static methods : can be called by using name > has a body
//  —         default methods: has a body, this is not access modifier.
//
//             Variables in Interface:
//            —We can have them but they need to be final and static.
//            —all variables are public static final. They have to be initialized.
//—           because final variables, it is better to make capital.
//           Methods can be private after java 9
    final static boolean wifiTurnOn= true;
    final static String typeOfModem ="xfinity";
    public abstract void turnWifiOforTurnOn();//ist by dafault public abstract
    public static void fiveG(){ //it should have a body because it is static
        System.out.println("This is static method in interface");
    }
    public default void geAlt(){ // it should have a body
        System.out.println(" deafault method");
    }
    void print ();



}
