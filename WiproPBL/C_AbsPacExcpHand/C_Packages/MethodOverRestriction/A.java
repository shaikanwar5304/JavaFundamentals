package MethodOverRestriction;

public class A {
    protected int protectedVar = 10;
    public void publicMethod(){
        System.out.println("I'm public method in A");
    }
    protected void protectedMethod(){
        System.out.println("I'm protected method in A");
    }
    void defaultMethod(){
        System.out.println("I'm default method in A");
    }
    private void privateMethod(){
        System.out.println("I'm private method in A");
    }
    public static void main(String[] args){
        A obj=new A();
        obj.publicMethod(); // I'm public method in A
        obj.protectedMethod(); // I'm protected method in A
        obj.defaultMethod(); // I'm default method in A
        obj.privateMethod(); // I'm private method in A
        restriction obj2=new restriction();
        // obj2.privateMethod(); can't access private method of A via subclass
        obj2.protectedMethod(); // I'm protected method in restriction
        obj2.defaultMethod(); // I'm default method in A
    }
}