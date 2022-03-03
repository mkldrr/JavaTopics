package jhfjfvhjv;

public class MethodOverloading {





    public static int countWords(String str) {

        String[] arr = str.split(" ");
        //System.out.println(arr.length);
//        int count =0;
//        for (int i = 0; i <arr.length ; i++) {
//            count++;
//        }
//        System.out.println(count);

        return arr.length;


    }

    public static int countWords(String [] str){

        int count=0;

        for (int i = 0; i < str.length; i++) {
            count++;
        }
        //System.out.println(count);
        return count;
    }


    public static void main(String[] args) {



//        int[] arr = {2,4,7,90,2,3};
//        int count =0;
//        for (int i = 0; i <arr.length ; i++) {
//          if (arr[i]>3){
//              count++;
//          }
//             //  0, 1, 2, 3, 3, 3
//        }
//        System.out.println(count);

        String sentence = "Michael jordon was a good basketball player";
        System.out.println(countWords(sentence));

        String [] str = {"Michael", "jordon", "was", "a", "good", "basketball", "player" };
        System.out.println(countWords(str));

    }

}
