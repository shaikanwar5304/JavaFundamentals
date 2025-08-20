// p11c1 is a subpackage in p1 but it won't get any special access. It will be same as another outside package
// so it implies this subpackage can only access public entities directly

// To run : 
//Go to the project root directory
//javac P1/P11/P11C1.java
//java P1/P11/P11C1
package P1.P11;
import P1.P1C1;

public class P11C1{ // not a subclass of p1c1 so can't access protected members
    public static void main(String[] args) {
        P1C1 obj=new P1C1();
        //System.out.println(obj.privateInt);//it is only for class
        //System.out.println(obj.defaultInt);//only with in package
        //System.out.println(obj.protectedInt);//with in package and in subclasses outside package
        System.out.println(obj.publicInt);//4
        
        P11SubClass obj2=new P11SubClass();
        //System.out.println(obj2.privateInt);
        //System.out.println(obj2.defaultInt);
        //System.out.println(obj2.protectedInt);//not for objects of subclasses
        System.out.println(obj2.publicInt);//4
        System.out.println(obj2.getProtectedInt());//6
    }
}
class P11SubClass extends P1C1{// subclass of P1C1 (so can access protected members)
    int getProtectedInt(){
        return this.protectedInt;//only accessable to subclasses not even to their instance outside the package
    }
}