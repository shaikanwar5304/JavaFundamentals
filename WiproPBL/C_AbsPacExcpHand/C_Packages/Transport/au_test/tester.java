// just a small example of packages imports etc..
package au_test;
import automobile.*;

public class tester {
    public static void main(String[] args) {
        System.out.println("I'm inside the au_test package.");
        Bike b = new Bike();
        Vehicle v = new Vehicle();
        Car c = new Car();
        b.printName();
        v.printName();
        c.printName();
    }
}
/*
I'm inside the au_test package.
Bike
I'm inside the automobile package.
Vehicle
I'm inside the automobile package.
Car
I'm inside the automobile package.
 */