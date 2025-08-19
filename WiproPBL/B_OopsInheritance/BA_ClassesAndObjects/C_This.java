// demonstration of "this" usage and some properties of it
public class C_This {
    public static void main(String[] args) {
        myClass2 myObj2=new myClass2(33);
        System.out.println(myObj2.insVar1);//33
        myClass2 myObj3=new myClass2();
        System.out.println(myObj3.insVar1);//999
    } 
}
class myClass2{
    int insVar1;
    static int staticVar;
    myClass2(int n){
        // this(); acceptable but we get error because of loop we trying to create
        this.insVar1=n;//this refers to the obj
        // this();// Err : constructor call should be the first statement
    }
    void myMethod(int n){
        //this(n); only used inside a constructor
        //this.randomVar=n; error randomVar not a instance var
        this.insVar1=n;
    }
    myClass2(){
        // this(); // Err : Recursive invocation
        this(999);// calling the constructor
    }
    static void myMethod(){
        // this.staticVar = 1; // we can't use this in static methods
    }
}
