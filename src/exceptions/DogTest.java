package exceptions;

public class DogTest {


    public static void main(String[] args) throws DogInvalidAgeException {


        Dog dog=new Dog();
        dog.setAge(19);
        dog.bark();

    }
}
