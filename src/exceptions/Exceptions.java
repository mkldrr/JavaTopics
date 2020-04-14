package exceptions;

public class Exceptions {



//——————————————————————————————————————————
//    Program Execution
//      —Exceptions are concept that breaks the normal flow execution, stops the program.
//—There two ways that the flow could be broken/stopped
//
//    Exceptions: when your code fails. The programmer must fix it. This can be considered as a bug.
//     Error: This is more serious issue which does  not come from the code. The programmer is not meant to fix this.
//    Ex: StackOverFlowError:  it happens when computer memory becomes full.
//
//
//    Checked Exception:Compile time
//    Unchecked Exception:Runtime
//
//    Only one way one to handle exception exception : try/catch
//    Only way to stop finally block from running is by using System.exit(0);
//
//—Exception is parent of all exception types
//—RuntimeException is the parent of all unchecked exceptions.
//
//
//            *How to ignore Exceptions
//    keyword <throws> : It allows to ignore the exceptions.
//            — this does not handle the exception, but it is just allowing program to compile.
//    The programmer accepts that there may be an exception thrown.
//            —You can have multiple exceptions in your method declaration
//  — ignoring multiple exceptions
//    Void method1() throws InterruptedException
//    漀
//There are two Types of Exception
//1.) Checked Exception:
//            — It is also known compile-time exception
//    — This type of exception must be handled before running the program.
//    — if the exception is not handled, the program will NOT compile, which means it wont run.
//            Ex: IOException, FileNotFoundException , InterruptedException
//
//2.) Unchecked Exception:
//            —It is also known run-time exception. During the execution.
//   —This type of exception comes during the program execution.
//   — The code compiles, but flow is interrupted.
//            — It is harder to handle this because there is no hint beforehand.
//    Ex: StringIndexOutOfBoundException, NullPointerException,
//    氀

    public static void main(String[] args) throws InterruptedException {

        int [] arr= new int [2];

        Thread.sleep(56);{

        }
        try {

            System.out.println("234567");
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("michael");
        }
    }

}
