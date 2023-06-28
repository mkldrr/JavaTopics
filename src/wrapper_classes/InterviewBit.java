package wrapper_classes;

public class InterviewBit {


    public int calculate(int a, int b) {
        try {
            return a - b;
        } catch (Exception e) {
            return a * b;
        } finally {
            return a + b;
        }
    }

}


//    public int num1;
//    static int num2;
//    void calculate(int a, int b)
//    {
//        num1 +=  a ;
//        num2 +=  b;
//    }
//}
