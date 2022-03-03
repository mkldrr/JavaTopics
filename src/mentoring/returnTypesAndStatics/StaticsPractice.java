package mentoring.returnTypesAndStatics;


public class StaticsPractice {


   String firstName;
   static String lastName;
   static  int age;
   static String city;


    public  StaticsPractice (){
     this.firstName="Mike";
     lastName="Smith";
     age=23;
     city="Chicago";
    }



    //TODO

    public void printInfo(){
       // this.firstName="Mike";
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: "+ lastName);


        System.out.println("Age: "+ age);
        System.out.println("City: " + city);

    }



    public  void printInfo2(){


        // this.firstName="Mike";
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: "+ lastName);

        System.out.println("Age: "+ age);
        System.out.println("City: " + city);

    }


    public static void main(String[] args) {
       StaticsPractice staticsPractice = new StaticsPractice();
       staticsPractice.printInfo();
    }










}
