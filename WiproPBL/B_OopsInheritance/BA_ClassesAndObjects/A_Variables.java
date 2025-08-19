// demonstrating than instance variable and static variables don't need initiation
// all others need declaration
public class A_Variables{
    public static void main(String[] args) {
        myClass myObj=new myClass();
        myObj.myMethod();
        //System.out.println(myClass.instVar);//not static
    }
}
class myClass{
    int instVar;//instance varible// initializes automatically with default value
    static int staticVar;// static variable also initializes automatically
    //System.out.println(instVar); //ERR, statements like this should be either in constructor or methods
    void myMethod(){
        int localVar;//local variable or the normal type of variables// should be initialized explicitly
        System.out.println(instVar);//0
        System.out.println(staticVar);//0
        //System.out.println(localVar);//error // needs initialization 
    }
}