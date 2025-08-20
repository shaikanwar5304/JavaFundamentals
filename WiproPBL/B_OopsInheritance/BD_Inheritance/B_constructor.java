// Demonstration of constructor order, calling of super() by default
class A1 {
    A1() {
        System.out.println("A1's no arg constructor");
    }
    A1(int a) {
        System.out.println("A1's constructor " + a);
    }
}

class B1 extends A1 {
    B1() {
        // by default super() will be here
        System.out.println("B1's no arg constructor");
    }
    B1(int b) {
        // by default super() will be here
        System.out.println("B1's constructor " + b);
    }
}

class C1 extends B1 {
    C1() {
        // super() won't be here because we are calling super(100);
        super(100);
        System.out.println("C1's no arg constructor");
    }
    C1(int c) {
        // by default super() will be here
        System.out.println("C1's constructor " + c);
    }
}

class B_constructor {
    public static void main(String[] args) {
        // C1 ca = new C1(10);
        C1 ca = new C1();
    }
}
// C1 ca = new C1(10);
/*
 * A1's no arg constructor
 * B1's no arg constructor
 * C1's constructor 10
 */
// C1 ca = new C1();
/*
 * A1's no arg constructor
 * B1's constructor 100
 * C1's no arg constructor
 */