package methods;

public class Varargs {



    public static void main(String[] args) {

        //int [] a={1,4,5,9,7,6,456};
        System.out.println(varargExample(1,4,5,9,7,6,456));
    }


    public static int  varargExample(int  ... arr){

        int max=0;
        for (int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
