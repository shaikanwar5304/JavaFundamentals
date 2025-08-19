//static methods can access only static variables
//instance methods, objects can access both instance and static entities
public class D_Static {
    public static void main(String[] args) {
        myClass.staticPrint();//staticPrint //3
        //myClass.instPrint();// err : only static methods are accessable to class
        myClass myObj=new myClass();
        myObj.instPrint();
        //normal staticPrint
        //3
        //4
        myObj.staticPrint();
        //static staticPrint //3
    }
}

class myClass{
    static int staticVar=3;
    int instanceVar=4;
    public static void staticPrint() {
        System.out.println("staticPrint");
        System.out.println(staticVar);
        // System.out.println(instanceVar); // can't access inst var in static methods
    }

    public void instPrint() {
        System.out.println("normal Print");
        System.out.println(staticVar);
        System.out.println(instanceVar);
    }
}