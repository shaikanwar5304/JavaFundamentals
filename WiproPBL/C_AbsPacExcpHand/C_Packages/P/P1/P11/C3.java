package P1.P11;
// import P1.P11.C1.C11; // can't find symbol c11
// we didn't named it C2 as it was in the same group of package P1.P2
public class C3 {
    public static void main(String[] args) {
        C11 myObj = new C11();
        myObj.className();//C11
    }    
}
// Note : c11 is default class inside c1, we can access it within the same package
// but not via regular process like java P1.P11.C3.java
// entire process should be via traditional compilation and then run the class files
// first we have to compile that java file first i.e javac P1/P11/C1.java
// c1.class and c3.class are created
// now again create class for c3 also i.e javac P1/P11/C3.java
// now run the program i.e java P1.P11.C3