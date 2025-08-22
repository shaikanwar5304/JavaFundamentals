// Demonstrating how reference variables can refer to objects of different classes in an inheritance hierarchy
// parent class reference variable can refer to child class objects
// but child class reference variable cannot refer to parent class objects
class A{
    int a;
}
class B extends A{
    int b;
}
class C extends A{
    int c;
}
public class B_referenceVar {
    public static void main(String[] args) {
        A obj1;
        B obj2;
        C obj3;
        obj1=new A();
        //superclass reference variable can refer subclass obj
        obj1=new B();
        System.out.println(obj1.a);//0
        // System.out.println(obj1.b);// Error // we can only access common attributes
        obj1=new C();
        // System.out.println(obj1.c);// Error // we can only access common attributes
        //obj2=new A();subclass type can't refer to super class type
        obj2=new B();
        //obj2=new C();similarly
        System.out.println("successful");//successful
    }
}
