// usage of instanceof
// The instanceof operator is used to test whether an object is an instance of a specific class or subclass.
// won't work for unrelated types
class A{

}
class B extends A{

}
class C extends B{

}
class Z extends A{

}

class C_instanceOf{
    public static void main(String[] args) {
        A aObj=new A();
        B bObj=new B();
        C cObj=new C();
        Z zObj=new Z();
        System.out.println((aObj instanceof A));//true
        System.out.println((bObj instanceof A));//true
        System.out.println((cObj instanceof A));//true
        System.out.println((cObj instanceof B));//true
        System.out.println((zObj instanceof A));//true
        System.out.println((bObj instanceof C));//false

        //System.out.println((B instanceof A)); //error 

        //System.out.println((cObj instanceof aObj));//error

        // System.out.println((bObj instanceof Z)); // unrelated types (error)
        // System.out.println((zObj instanceof B)); // error : compiler don't allow checks between two unrelated types
    }
}