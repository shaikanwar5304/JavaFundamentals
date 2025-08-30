// another way of creating user-defined exceptions by passing string to the parent class
class InvalidInputException extends Exception {
    InvalidInputException(String s) {
        super(s);//passing the error msg to Exception
    }
}

class Input {
    void method() throws InvalidInputException {
        throw new InvalidInputException("Invalid Input");
    }
}

public class B_throw {
    public static void main (String[] args) {
        try {
            new Input().method() ; // new Input() is the object of Input, and we are calling that method which is throwing the exception
        }
        catch (InvalidInputException e) {

            System.out.println(e.getMessage());//Invalid Input

            e.printStackTrace();//explains the path that triggered the exception
            // InvalidInputException: Invalid Input
            //         at Input.method(B_throw.java:9)
            //         at B_throw.main(B_throw.java:16)
        }
    }
}