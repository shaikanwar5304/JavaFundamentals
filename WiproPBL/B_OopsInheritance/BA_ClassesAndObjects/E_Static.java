//static variables and methods belongs to classes and all instances i.e a common property
//i.e if any object changes the static variables it reflects in the class and all the instances
// instance variable won't be affected every object has it's own instance variable
public class E_Static{
    public static void main(String[] args) {
        System.out.println(MyClass.staticVar);//0
        MyClass myObj=new MyClass();
        MyClass myObj2=new MyClass();
        System.out.println(myObj.staticVar);//0
        myObj.staticVar=999;
        System.out.println(MyClass.staticVar);//999 // all others will be changed
        System.out.println(myObj2.staticVar);//999 
        myObj.insVar = 888;
        System.out.println(myObj2.insVar); // 3 // no change
        // System.out.println(MyClass.insVar); // instance var can't be referred from static context
    }
}

class MyClass{
    static int staticVar;
    int insVar=3;
}