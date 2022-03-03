import java.util.Arrays;

public class Help {


    public static void main(String[] args) {



























        int subset =2;
        int [] arr = {1,2,3,4,5,6,7,8};

        for (int i = 0; i <arr.length ; i++) {

            int temp= arr[i];

            arr[i]= arr[i+1];   //because I am changing the index

            arr[i+1]= temp;

            i += subset-1;  // i try to control the iteration

            // now it is time for selenium
        }

        System.out.println(Arrays.toString(arr));

            // here is the answer

        // okay okay dont mention
        // you want this, now you say i did not know , so she will think you are not qualified

        // selenium webdriver // you can do it

        // code code

        // just go to ui and inpect element and send key

        // Driver.get
        // Driver.findelement
        // send keys
        // click tye signin button

    }
}
