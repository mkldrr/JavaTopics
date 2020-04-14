package final_finalize_finally;

public class Final {
//
//
//    Final keyword can be applied to variables, methods and class.
//
//    Final variable: earn final keyword is applied to variable, that variable value can’t be reassigned. Value of that variable can not be changed.
//
//    Ex: int int a =5
//    a = 12
//
//    final int a = 5, variable ‘a’ cannot be changed anymore. k=12, Java will not allow.
//
//    Final variable are also known as constant variable.
//    Final variables are used for things that should not be changed
//    Ex: Pi > double pi =3.14.
//
//            Local variables: declared with in the scope of methods and in any curly braces. They can be used only there. They don’t have default value. Programmer must initialize local variable before using it.
//
//    Instance variables:
//
//    If final will be used for instance variable; we have to give the value at first.
    public static final String name= "Michael";


    public static void main(String[] args) {

        System.out.println(name);

    }
}
