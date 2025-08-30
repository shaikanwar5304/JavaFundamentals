// if a constructor of parent class throws checked exceptions then as it will defaultly called in child class constructor
// we have to handle the exceptions or declared with thrown
// so if parent throws some FileNotFoundException then child must handle it with Exception or IOException or minimum FileNotFoundException
// NOTE : HERE YOU ARE NOT MODIFYING A METHOD OR OVERRIDING IT. 
// YOU ARE WRAPPING UP FOR A CONSTRUCTOR AND TRYING TO WARN WHICH TYPES OF EXCEPTIONS CAN BE CAUSED BY IT. 
// SO THE WARNINGS SHOULD BE EITHER OF THE SAME KIND OF EXCEPTION OR A SUPERCLASS OF THE EXCEPTION WHICH THE PARENT CONSTRUCTOR DECLARED
import java.io.*;

class Plane {
    public Plane() throws IOException, RuntimeException {
        System.out.println("Plane") ;
    }
}

class Jet extends Plane  { // Jet should handle the checked exceptions of the super class constructor

    // Jet() throws SQLException{//ERror as it is out of parent scope

    Jet() throws Exception { // Exception will automatically be handle the (checked) IOException thrown by the parent constructor
        super();
    }
    // correct

    // or
    
    // Jet() throws IOException {
    //     super();
    // }
    // correct as it handles the checked exception

    // Jet() throws RuntimeException {
    //     super();
    // }
    // wrong as it only handles the unchecked exception which is not even needed

    // Jet() throws FileNotFoundException {
    //     super();
    // }
    // this is also not sufficient as other subclasses of IOException are not handled
}

public class Tester {
    public static void main(String args[]) throws IOException {
        new Plane () ;
    }
}