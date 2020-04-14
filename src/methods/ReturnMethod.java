package methods;

import java.util.ArrayList;

public class ReturnMethod {


    public static void main(String[] args) {

        System.out.println(integerReturn());
        System.out.println(login("admin","admin12"));
    }



    public static int integerReturn(){

        int num =3;
        return num;
    }


    public static String printName(){

        String name="James";
        return name;
    }


    public static int biggestNum(int [] arr){

        int biggetsNum=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>biggetsNum){
                biggetsNum=arr[i];   // 3,6,57, 0,2,5,

            }


        }
        return biggetsNum;
    }


    public static boolean login(String userName, String password){

        String validUserName="admin";
        String validPassword="admin123";

        if(userName.equals(validUserName) && password.equals(validPassword)){
            System.out.println("You sucessfully logged in");
            return true;
        }

        else {
            System.out.println("Invalid username or password");
            return false;
        }

    }

    public static ArrayList<Integer> listOfEvenNumbers(int [] arr){

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){

                list.add(arr[i]);
            }

        }
        return list;
    }

}
