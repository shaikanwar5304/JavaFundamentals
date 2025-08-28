// just testing accesses modifiers across different files in packages
import test.*;
// var1 is declared private
// var2 is declared default
// var3 is declared protected
// var4 is declared public
public class NewClass extends foundation {
    public void display() {//non static method
        System.out.println(var3);//30
    }
    public static void main(String[] args) {
        foundation obj = new foundation();
        // System.out.println(obj.var1); only within class
        //System.out.println(obj.var2);// only within package
        //System.out.println(obj.var3);//only for subclass in different package
        //System.out.println(var3);//can't access instance var from static method
        System.out.println(obj.var4);//40
    }
}