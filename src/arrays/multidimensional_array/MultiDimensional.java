package arrays.multidimensional_array;

import java.util.Arrays;

public class MultiDimensional {


    // it is array in side of another array


    //[    [    342,75,7   ]   ]

    public static void main(String[] args) {




        int [] [] arr = new int [2][3];


        //  [  [] , []   ]

        arr [0][0]= 3;
        arr [0][1]=4;
        arr [0][2]=9;

        arr[1][0] =4;
        arr[1][1]=8;
        arr[1][2]=6;
        System.out.println(Arrays.deepToString(arr));


        int [] [] arr3 = new int [3 ] [];

        arr3 [0] =  new int []{1,4,6,8,9};
        arr3[1]=new int[] {2,45,8,32,4};
        arr3[2]=new int[]{2,5,987654,4,2};
        System.out.println(Arrays.deepToString(arr3));


        int [] [] nums = new int[3][6];
        //it is okay to leave the second square brackets empty. it means it can be any number.
        System.out.println(Arrays.deepToString(nums));


        int arr2 [] [] [] = { { {123,34,5,8  }, {2,56,78,9}  } };



        System.out.println(Arrays.deepToString(arr2));



    //    int[][] nums2 = {{4, 2, 3,4}, {3232, 11, 13, 4, 2}, {23, 13}};




        //                | arrays  |

     // row1 index 0 --   4,2,3,4
     // row2  index 1--   3232,11,13,4,2
     // row3  index 2--   23,13

        int[][] nums2 = {{4, 2, 3,4}, {3232, 11, 13, 4, 2}, {23, 13,3}};
        System.out.println("Length of row 1: " + nums2 [0].length);
        System.out.println("Length of row 2: " + nums2 [1].length);
        System.out.println("Length of row 3: " + nums2 [2].length);


        for (int i = 0; i <nums2.length ; i++) {

            for (int j = 0; j <nums2[i].length ; j++) {
                System.out.println(nums2[i][j]);
            }
            System.out.println();

        }















    }





}
