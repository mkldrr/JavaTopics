package exceptions;

public class Dog {

    //    IQ: throw vs throws?
//    Throw :this is when we are explicitly creating and using an exception
//    Throws: declaring an exception and allowing it to pass through the method. Ignore/ accept the exception.
//


    int age;


    public void setAge(int age) throws DogInvalidAgeException {
        if(age<0 || age> 30){
            throw new DogInvalidAgeException();
        }
        this.age=age;
        System.out.println(age);
    }


    public void bark(){

        if(this.age>20){
            throw new DogNotBarkAbleException();
        }
        else {
            System.out.println("Dog is barkable");
        }
    }
}
