/**
 * MulInh
 */
interface interf1 {
    void interfaceName1();
    void display();
    int n1=20;
}
interface  interf2{
    void interfaceName2();
    //int interfaceName1(); you should not have different datatypes with same name here
    void display();
    int n1=30;
    int n2=40;
}
//interface interf3 implements interf1{}//interface can't implement another interface
interface interf3 extends interf1,interf2{//multiple inheritance is allowed
    int n2=4;
}//interface can extend another interface
public class MulInh implements interf1,interf2{
    public void interfaceName1(){
        System.out.println("Interface 1");
    }
    public void interfaceName2(){
        System.out.println("Interface 2");
    }
    public void display(){
        System.out.println("Display");
    }

    public static void main(String[] args) {
        System.out.println(interf1.n1);//20
        System.out.println(interf2.n1);//30
        System.out.println(n2);//40
        //n2=50;//can't reassign as it is final by default
        //System.out.println(n1);//Error : Ambiguous (as it is inherited from both interfaces)
    }
}