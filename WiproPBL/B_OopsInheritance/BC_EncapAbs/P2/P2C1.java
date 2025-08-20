// P2C1 is in a different package than P1C1
package P2;
import P1.P1C1;
public class P2C1 {
    public static void main(String[] args) {
        P1C1 Obj=new P1C1();
        System.out.println(Obj.publicInt);
        //private and default can;t be accessed from other packages
        //protected can be accessed to the subclass
        P2SubClass obj2=new P2SubClass();
        //System.out.println(obj2.protectedInt);//not for objects of subclasses
        System.out.println(obj2.var);
    }
}
class P2SubClass extends P1C1{// subclass of P1C1 (so can access protected members)
    int var = this.protectedInt;// only accessible to subclasses not even to their instance
}