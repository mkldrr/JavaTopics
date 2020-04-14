package oop;

public class Dad extends Human {



    @Override
    public void sleeping() {
        System.out.println("Dad is sleeping");
    }
    @Override
    public void talking() {
        System.out.println("Dad is talking");
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public static void run(){
        System.out.println("Dad is running ");
    }


}
