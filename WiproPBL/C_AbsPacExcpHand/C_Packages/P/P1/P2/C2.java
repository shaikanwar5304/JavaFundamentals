package P1.P2;
import P1.P11.C1;
// import P1.P11.C11;// Error : the class was default so can't be accessed in other package
public class C2 {
    public static void main(String[] args) {
        C1 myObj =new C1();
        myObj.className();//C1
    }
}
