// super is similar to this 
// this related to current class
// super related to parent class
// both of them can't be used in static entities (methods)
// but both of them can access instance and static entities also
class F_Static extends ParentClass {
    int instanceVar = 10;
    
    public void myInstance() { // we can access both super and this in instance entities
        System.out.println("myInstance method");
        super.parentStatic();
        this.instanceVar = 40;
    }

    public static void myStatic() {
        System.out.println("myStatic method");
        // super.parentStatic(); // err : we can't use super in static methods or entities
        // System.out.println(this.instanceVar); // Error: we can't use this in static methods
    }

    public static void main(String[] args) {
        // child class static method
        F_Static.myStatic();//myStatic method
        // parent class static method
        F_Static.parentStatic();//parentStatic method
        //System.out.println(F_Static.instanceVar);//only static are accessable
    }
}

class ParentClass {
    public static void parentStatic(){
        System.out.println("parentStatic method");
    }
    public void parentInstance() {
        System.out.println("parentInstance method");
    }
}