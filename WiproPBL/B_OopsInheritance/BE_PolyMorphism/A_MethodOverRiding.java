/**
 * A_MethodOverRiding (between the classes) same method but different implementation
 * method overloading is similar but with in the class // same method name but different parameters 
 * these concepts are related to having same method name but having different
 * functionalities based on their signature
 */
class A {
    void display(int a) {
        System.out.println("hi this is A's method");
    }
}

class B extends A {
    void display(int n) {// overridden
        System.out.println("hi this is B's method");
    }

    void displayOverridden(int n) { // A way of accessing A's overridden method
        super.display(n);
    }
}

public class A_MethodOverRiding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(3);// hi this is B's method
        obj.displayOverridden(0);// hi this is A's method
    }

}