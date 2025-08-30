// understanding the sequance of writing catch blocks
// and some types of exceptions
import java.util.*;
public class B_Excphand {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        try{
            System.out.println("enter a denominator");
            int a = sc.nextInt();
            System.out.println(100/a);
        }
        //catch(Exception e){}//should not be above its subclass
        // meaning : while writing catch blocks write the specific exceptions (subclasses first)
        // and generalize while going down (parent classes last) because they have more kinds of exceptions
        // if we put the most generalized exception (Exception e) first, it will catch all exceptions and there
        // will be no point in having the more specific exceptions
        catch( InputMismatchException | ArithmeticException e){
            // RuntimeException = (ArithmeticException + NoSuchElementException + ...)
            // NoSuchElementException = (InputMismatchException + ...)
            System.out.println(e);
        }
        catch(Exception e){
            // Exception e = (RuntimeException + ...)
            System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("after try catch finally block");
    }
}
// output 1 :
/*
enter a denominator
d
java.util.InputMismatchException
finally block
after try catch finally block
*/

// output 2 :
/**
enter a denominator
3
33
finally block
after try catch finally block
 */

// output 3 :
/**
enter a denominator
0
java.lang.ArithmeticException: / by zero
finally block
after try catch finally block
 */