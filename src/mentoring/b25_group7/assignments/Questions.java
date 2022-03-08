package mentoring.b25_group7.assignments;

import java.util.*;

public class Questions {


    //TODO: Create a method which will return an integer (return type). This method will have an int array parameter.
    // Return the number from that array which is the second highest num.
    //    Create a method that will accept an int array. Return the number which is the second to biggest number./
    //    ** Do not use sort method *   Ex:     > input: 1,3,22,44,12,30,32,54,31 > output: 44


    public static void main(String[] args) {

        int[] arr = {1000, 1000, 343, 343, 493, 1000, 200,44, 475, 475, 48, 48, 1000, 769, 1, 3, 1, 3, 22, 22, 44, 12, 12, 30, 32, 1000, 54, 30, 30};
        String str = "Mikail";


        // System.out.println( " Second max is:   "+   secondMax(arr));
        // secondMax1(arr);

        //System.out.println(findSecHigh(arr));

        // swap(76,50);

        //  swapStrings("apple", "banana");


        // System.out.println(evenNum(arr));

        // System.out.println(oddNumsMap(arr));

        //System.out.println(sumOfDigits(str));

        //occurrenceOfLetters(str);

        // System.out.println(fibonacci7(47));

        System.out.println(removedDuplicates(arr));

    }


    public static int secondMax(int[] arr) {

        //[1200, 475,48,1000, 769, 1,3,22,44,12,30,32, 1000, 54,31 ]


        int max = 0;     //1200
        int secondMax = 0;  //1200

        for (int i = 0; i < arr.length; i++) {                //max :1200
            //secondMax :
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }

        }

        return secondMax;
    }


    //Aykhan :

    //  Write a function that can return the second highest number from an integer array

    public static int secondHighestNumber(int[] arr) {

        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }

        for (int i = 0; i < 1; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }

        result = Collections.max(list);

        return result;
    }


//
//}


    //    package Taskssss;   Gorkhmaz
//
//    public class MikailTask1 {
//
//        public static void main(String[] args) {
//
//            int arr[] = {7, 3 ,34, 47, 54, 1, 54};
//            secondMax(arr);
//        }
//
//
    public static void secondMax1(int arr[]) {

        int max = arr[0];
        int secMax = arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                secMax = max;
                max = arr[i];
                //  secMax = arr[0];

            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }


    public static int findSecHigh(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
            // 1,2,3,4,5,5,6,6 //==5
        }

        int n = 2;
        int result = 0;

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
            //1,2,3,4,5,5

        }

        result = Collections.max(list);
        return result;


    }


    //TODO Create a void method which will swap 2 integer without creating third variable. This method will have 2 int params.

// int a = 3
// int b = 5

// num will become 5;
// num2 will become 3;


    public static void swap(int a, int b) {


        a = a + b;  //8

        b = a - b;  //3

        a = a - b; //5

        System.out.println("a: " + a + " b: " + b);

    }


    public static void swapStrings(String a, String b) {


        //a: apple
        //b:  banana


        //substring


        a = a + "" + b;


        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());


        System.out.println("word a: " + a + "     word b: " + b);


    }


//TODO ================================================================================================================


    //TODO: Create a method which will return an  Integer ArrayList. The method will accept an int array parameter.
    // Return every even number which are in the Array.


    public static ArrayList<Integer> evenNum(int[] arr) {   // [ 4.6.8.3.9.3.9.4.2     ]


        ArrayList<Integer> evenNums = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) evenNums.add(arr[i]);


        }
        return evenNums;


    }


    public static ArrayList<Integer> evenNumbers(int[] arr) {


        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (Integer each : arr) {
            numbers.add(each);
        }
        ArrayList<Integer> even = new ArrayList<>();


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }

        }
        return even;
    }


    //TODO Create a method which will Find the odd numbers from array and put them in the map one by one  and return as a map type


    public static HashMap<Integer, Integer> oddNumsMap(int[] arr) {


        HashMap<Integer, Integer> oddNumsMap = new HashMap<>();  //int[] arr = {1000, 343,493, 1200, 475, 48, 1000, 769, 1, 3, 22, 44, 12, 30, 32, 1000, 54, 31};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {

                oddNumsMap.put(i, arr[i]);
            }

        }

        return oddNumsMap;
    }


    //TODO ================================================================================================================


    //TODO Occurrences of letters in a string "dfnvdfjkvndfknvkjdfnvkdfnv" : Create  void method which will accept a string " abrakadabra". Please find the how many
    // times each letter occurs/dispay in the string and print in the following format:

//    abrakadabra =  has 5 times a
//    abrakadabra =  has 2 times b
//    abrakadabra =  has 2 times r
//    abrakadabra =  has 1 times k
//    abrakadabra =  has 1 times d


    public static void occurrenceOfLetters(String sentence) {


        //   abrakadabr

        String checked = "";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {                  // 1.loop   i [ 0 > a ]  i [ 1 > b ] ...  i [ 3 > a ]

            if (!checked.contains(sentence.charAt(i) + "")) {
                //   abrakadabr

                for (int j = 0; j < sentence.length(); j++) {           //.2 loop :  j [ 0 > a  ], [ 1 > b  ] [ 2 > r  ] [ 3 > a  ]
                    if (sentence.charAt(i) == sentence.charAt(j)) {
                        count++;   // 1+1
                    }
                }
                checked += sentence.charAt(i) + " ";  // checked a b


                System.out.println(sentence + " =  has " + count + " times " + sentence.charAt(i));
                count = 0;
            }
        }

    }


    //Example 1
    public static void frequencyOfeachChar(String word) {

        String nonRepeat = "";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            String chatacter = "" + word.charAt(i);
            while (!(nonRepeat.contains(chatacter))) {
                nonRepeat += chatacter;
            }
        }

        for (int i = 0; i < nonRepeat.length(); i++) {
            char eachCh = nonRepeat.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == eachCh) {
                    frequency++;
                }
            }
            result += "" + word + "= " + "has " + frequency + " times " + eachCh + "\n";
        }
        System.out.println(result);
    }


    //Example 2

    public static HashMap<Character, Integer> occurrence(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();

        for (char eachChar : arr) {

            if (map.containsKey(eachChar)) {
                map.put(eachChar, map.get(eachChar) + 1);
            } else {
                map.put(eachChar, 1);
            }
        }

        return map;
    }


    public static void accourance2(String someString) {
        //String someString = "abrakadabra";
        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            for (int y = 0; y < someString.length(); y++) {
                if (someString.charAt(i) == someString.charAt(y)) {
                    count++;
                }
            }
            String currentChar = String.valueOf(someString.charAt(i));
            if (!someString.substring(0, i).contains(currentChar)) {
                System.out.println(someString + " = has " + count + " times " + someString.charAt(i));
            }
            count = 0;
        }


    }


    //TODO    11 - Write a method that will accept a string and return sum of numbers in a string.
    // Input: "I5 a3m an Soft9ware 2 Develop3er" output: 5 + 3 + 9 + 2 + 3 = 22


    public static String sumOfDigits(String sentence) {  //// Input: "I5 a3m an Soft9ware 2 Develop3er"

        String digits = "";
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {

                sum += Integer.parseInt(sentence.charAt(i) + "");
                digits += sentence.charAt(i) + " + ";
            }
        }
        return digits.substring(0, digits.length() - 2) + " = " + sum;
    }


    //TODO  Create a method which will return a sting. This method will accept  int. You will need to find the fibonacci
    // numbers until the  [ int param] number iteration.
    // Limitation: Use only one loop.


    public static String fibonacciNumbers(int num) {  // 10

        String fibonacciNumbers = "";

        int number1 = 0;
        int number2 = 1;
        int sum = 0;
        //


        for (int i = 0; i < num; i++) { // i = 0,1,3,4,6, 7


            // 0,1,1,2,3,5,8,13,....

            fibonacciNumbers += number1 + " "; //fib: 0, 1, 1, 2, 3, 5, .......

            //number1: 0,1, 2, 3,

            sum = number1 + number2; // 1,2,3,5,8
            number1 = number2; // num1: 1, 1, 2, 3, 5,
            number2 = sum;//num2: 1, 2, 3, 5,8


        }

        return fibonacciNumbers;


    }


    //======================

    public static String fibonacci(int num) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        String sequence = num1 + " " + num2;

        for (int i = 2; i < num; i++) {

            sum = num1 + num2;
            sequence += " " + sum;
            num1 = num2;
            num2 = sum;
        }

        return sequence;

    }


    //=============


    public static String fibonacci2(int n) {

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        String str = "";

        for (int i = 1; i <= n; i++) {

            if (n1 <= n) {
                str += n1 + " ";
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(str);
        return str;
    }

    //=====

    public static String fibonacci3(int num) {
        String result = "";

        int[] nums = new int[num + 1];
        nums[0] = 0;
        nums[1] = 1;
        System.out.print(nums[0] + " " + nums[1] + " ");
        for (int i = 2; i < num; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
            result += nums[i] + " ";
        }
        return result;
    }


    public static String fibonacci4(int n) {
        int fib = 15;

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        String str = "";

        for (int i = 1; i <= fib; i++) {

            if (n1 <= fib) {
                str += n1 + " ";
            }
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println(str);
        return str;


    }


    //====

    public static String fibonacci5(int number) {
        int[] result = new int[number];

        result[0] = 0;
        result[1] = 1;


        for (int i = 2; i < result.length; i++) {

            result[i] = result[i - 1] + result[i - 2];

        }
        return Arrays.toString(result);
    }


    //====

    public static String fibonacci6(int n) {
        String result = "";

        int sum = 0;
        int prevNum = 1;
        int currentNum = 0;


        while (currentNum <= n) {
            result += "" + currentNum + " ";
            sum = prevNum;
            prevNum = currentNum;
            currentNum = sum + prevNum;
        }
        return result;
    }


    //==


    public static String fibonacci7(int givenNumber) {
        String finalResult = "";

        int num1 = 0;
        int num2 = 1;

        finalResult += num1 + " " + num2 + " ";

        for (int i = 2; i < givenNumber; i++) {
            int result = num1 + num2;
            finalResult += result + " ";

            num1 = num2;
            num2 = result;
        }
        return finalResult;
    }


    public static String fibonacci8(int num) {
        String result = "";

        int num1 = 0;
        int num2 = 1;

        result += num1 + " " + num2 + " ";

        for (int i = 2; i < num; i++) {
            int temp = num1 + num2;
            result += temp + " ";

            num1 = num2;
            num2 = temp;
        }
        return result;

    }


    //TODO ================================================================================================================


    //TODO : Write method which will return an Integer ArrayList. This method should accept and int array. Please return the non-
    // duplicate numbers from the array


    //---------
    public static ArrayList<Integer> nonDup(int[] arr) {
        ArrayList<Integer> finalVersion = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            int each = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (each == arr[j]) {
                    freq++;
                }
            }
            if (freq == 1) {
                finalVersion.add(each);
            }
        }
        return finalVersion;
    }


    public static ArrayList<Integer> nonDuplicate(int[] arr) {
        ArrayList<Integer> finalVersion = new ArrayList<>();
        List<Integer> non_Primitive = new ArrayList<>();//converting primitive int to non-primitive
        for (int each : arr) {
            non_Primitive.add(each);
        }
        for (int each : arr) {
            if (Collections.frequency(non_Primitive, each) == 1) {
                finalVersion.add(each);
            }
        }
        return finalVersion;

    }


    //--------

    public static ArrayList<Integer> removed(int [] arr) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                int second = arr[j];
                if (first == second) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(arr[i]);
            }
        }
        return list;
    }



    public static ArrayList<Integer> nonduplicates(int[] array) {
        ArrayList<Integer> nonduplicates = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int frequency=0;

            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j])
                    frequency++;
            }
            if(!nonduplicates.contains(array[i])){
                if(frequency==1)
                    nonduplicates.add(array[i]);
            }
        }
        return nonduplicates;
    }


    //------

    public static ArrayList<Integer> nonDuplicates(int[] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            int count=0;
            for (int i = 0; i < array.length; i++) {
                if(each==array[i]){
                    count++;
                }
            }
            if(count==1){
                list.add(each);
            }
        }
        return list;
    }


    public static ArrayList<Integer> returnNonDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            int count = 0;
            for (int element : arr) {
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                list.add(each);
            }
        }
        return list;
    }


    //----------

    public static ArrayList<Integer> removedDuplicates(int[] array) {


        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count == 1) {
                unique.add(array[i]);
            }
        }
        return unique;

    }










}


