import java.io.IOException;
// if a try block has a checked exception, it must be handled with a catch block
// if a try block has an unchecked exception, it may not be handled
public class B_final {
    static void funcA() throws ArithmeticException {
        ArithmeticException e = new ArithmeticException();
        throw e;
    }

    static void funB() throws Exception {
        throw new NumberFormatException();
    }

    static void funC() throws Exception {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            B_final.funB();// since funB() throws Exception, it may be a checked exception so it must be
                           // handled
        } catch (Exception e) {
            System.out.println("sout in catch");// sout in catch
        } finally {
            System.out.println("sout in finally");// sout in finally
        }
        try {
            B_final.funcA();// since funcA() throws ArithmeticException, it may be a unchecked exception so
                            // it need not be handled
            // B_final.funB(); // this throws a checked exception so need to be handled (i.e. catch block required definitely)
        } finally {
            System.out.println("sout in finally");// sout in finally
        }
        System.out.println("after first try finally block");// as the exception is not handleed the next statements are not executed
    }
}
